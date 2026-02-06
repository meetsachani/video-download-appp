package okhttp3.internal.http2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.C10662xF;
import o.C2730De2;
import o.C4788Ye;
import o.C5002a60;
import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.C9516sY;
import o.C9604su1;
import o.InterfaceC2677Cq;
import o.InterfaceC7058iW0;
import o.InterfaceC7072ia2;
import o.InterfaceC8289nW0;
import o.Q32;
import o.V12;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class Hpack {
    @NotNull
    public static final Hpack INSTANCE;
    @NotNull
    private static final Map<C8859ps, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    @NotNull
    private static final Header[] STATIC_HEADER_TABLE;

    /* loaded from: classes4.dex */
    public static final class Reader {
        @InterfaceC7058iW0
        @NotNull
        public Header[] dynamicTable;
        @InterfaceC7058iW0
        public int dynamicTableByteCount;
        @InterfaceC7058iW0
        public int headerCount;
        @NotNull
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        @NotNull
        private final InterfaceC2677Cq source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public Reader(@NotNull InterfaceC7072ia2 interfaceC7072ia2, int i) {
            this(interfaceC7072ia2, i, 0, 4, null);
            C6562gT0.p(interfaceC7072ia2, "source");
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            C4788Ye.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    C6562gT0.m(header);
                    int i4 = header.hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final C8859ps getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    C6562gT0.m(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                C6562gT0.m(header2);
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            if (i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                return true;
            }
            return false;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    C6562gT0.m(header);
                    this.headerList.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        @NotNull
        public final List<Header> getAndResetHeaderList() {
            List<Header> Y5 = C10662xF.Y5(this.headerList);
            this.headerList.clear();
            return Y5;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @NotNull
        public final C8859ps readByteString() throws IOException {
            boolean z;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long readInt = readInt(readByte, 127);
            if (z) {
                C5422bq c5422bq = new C5422bq();
                Huffman.INSTANCE.decode(this.source, readInt, c5422bq);
                return c5422bq.G4();
            }
            return this.source.n3(readInt);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.M3()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and != 128) {
                    if ((and & 128) == 128) {
                        readIndexedHeader(readInt(and, 127) - 1);
                    } else if (and == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((and & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                    } else if ((and & 32) == 32) {
                        int readInt = readInt(and, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                        }
                    } else if (and != 16 && and != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public final int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) != 0) {
                    i2 += (readByte & 127) << i4;
                    i4 += 7;
                } else {
                    return i2 + (readByte << i4);
                }
            }
        }

        @InterfaceC8289nW0
        public Reader(@NotNull InterfaceC7072ia2 interfaceC7072ia2, int i, int i2) {
            C6562gT0.p(interfaceC7072ia2, "source");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = C9604su1.e(interfaceC7072ia2);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Reader(InterfaceC7072ia2 interfaceC7072ia2, int i, int i2, int i3, C9516sY c9516sY) {
            this(interfaceC7072ia2, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Writer {
        @InterfaceC7058iW0
        @NotNull
        public Header[] dynamicTable;
        @InterfaceC7058iW0
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        @InterfaceC7058iW0
        public int headerCount;
        @InterfaceC7058iW0
        public int headerTableSizeSetting;
        @InterfaceC7058iW0
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        @NotNull
        private final C5422bq out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public Writer(int i, @NotNull C5422bq c5422bq) {
            this(i, false, c5422bq, 2, null);
            C6562gT0.p(c5422bq, "out");
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            C4788Ye.V1(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    C6562gT0.m(header);
                    i -= header.hpackSize;
                    int i4 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    C6562gT0.m(header2);
                    this.dynamicTableByteCount = i4 - header2.hpackSize;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(@NotNull C8859ps c8859ps) throws IOException {
            C6562gT0.p(c8859ps, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(c8859ps) < c8859ps.g0()) {
                    C5422bq c5422bq = new C5422bq();
                    huffman.encode(c8859ps, c5422bq);
                    C8859ps G4 = c5422bq.G4();
                    writeInt(G4.g0(), 127, 128);
                    this.out.K4(G4);
                    return;
                }
            }
            writeInt(c8859ps.g0(), 127, 0);
            this.out.K4(c8859ps);
        }

        public final void writeHeaders(@NotNull List<Header> list) throws IOException {
            int i;
            int i2;
            C6562gT0.p(list, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header header = list.get(i4);
                C8859ps p0 = header.name.p0();
                C8859ps c8859ps = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(p0);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (C6562gT0.g(hpack.getSTATIC_HEADER_TABLE()[intValue].value, c8859ps)) {
                            i = i2;
                        } else if (C6562gT0.g(hpack.getSTATIC_HEADER_TABLE()[i2].value, c8859ps)) {
                            i = i2;
                            i2 = intValue + 2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i5];
                        C6562gT0.m(header2);
                        if (C6562gT0.g(header2.name, p0)) {
                            Header header3 = this.dynamicTable[i5];
                            C6562gT0.m(header3);
                            if (C6562gT0.g(header3.value, c8859ps)) {
                                i2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i5 - this.nextHeaderIndex);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    writeInt(i2, 127, 128);
                } else if (i == -1) {
                    this.out.writeByte(64);
                    writeByteString(p0);
                    writeByteString(c8859ps);
                    insertIntoDynamicTable(header);
                } else if (p0.h0(Header.PSEUDO_PREFIX) && !C6562gT0.g(Header.TARGET_AUTHORITY, p0)) {
                    writeInt(i, 15, 0);
                    writeByteString(c8859ps);
                } else {
                    writeInt(i, 63, 64);
                    writeByteString(c8859ps);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.writeByte(i | i3);
                return;
            }
            this.out.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.writeByte(i4);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @InterfaceC8289nW0
        public Writer(@NotNull C5422bq c5422bq) {
            this(0, false, c5422bq, 3, null);
            C6562gT0.p(c5422bq, "out");
        }

        @InterfaceC8289nW0
        public Writer(int i, boolean z, @NotNull C5422bq c5422bq) {
            C6562gT0.p(c5422bq, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = c5422bq;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z, C5422bq c5422bq, int i2, C9516sY c9516sY) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, c5422bq);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        C8859ps c8859ps = Header.TARGET_METHOD;
        Header header2 = new Header(c8859ps, "GET");
        Header header3 = new Header(c8859ps, Q32.j);
        C8859ps c8859ps2 = Header.TARGET_PATH;
        Header header4 = new Header(c8859ps2, RemoteSettings.i);
        Header header5 = new Header(c8859ps2, "/index.html");
        C8859ps c8859ps3 = Header.TARGET_SCHEME;
        Header header6 = new Header(c8859ps3, "http");
        Header header7 = new Header(c8859ps3, "https");
        C8859ps c8859ps4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(c8859ps4, "200"), new Header(c8859ps4, "204"), new Header(c8859ps4, "206"), new Header(c8859ps4, "304"), new Header(c8859ps4, "400"), new Header(c8859ps4, "404"), new Header(c8859ps4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header(C2730De2.j, ""), new Header(C5002a60.k, ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(FirebaseAnalytics.Param.s, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header(V12.q, ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<C8859ps, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<C8859ps, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C6562gT0.o(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    @NotNull
    public final C8859ps checkLowercase(@NotNull C8859ps c8859ps) throws IOException {
        C6562gT0.p(c8859ps, "name");
        int g0 = c8859ps.g0();
        for (int i = 0; i < g0; i++) {
            byte v = c8859ps.v(i);
            if (65 <= v && v < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c8859ps.s0());
            }
        }
        return c8859ps;
    }

    @NotNull
    public final Map<C8859ps, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
