package okhttp3.internal.http2;

import java.io.IOException;
import o.C10997yd1;
import o.C4788Ye;
import o.C6562gT0;
import o.C8077mf;
import o.C8859ps;
import o.C9680tD0;
import o.InterfaceC2579Bq;
import o.InterfaceC2677Cq;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Huffman {
    @NotNull
    private static final byte[] CODE_BIT_COUNTS;
    @NotNull
    private static final Node root;
    @NotNull
    public static final Huffman INSTANCE = new Huffman();
    @NotNull
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, C9680tD0.j, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, C10997yd1.w1, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    static {
        byte[] bArr = {13, C8077mf.A, 28, 28, 28, 28, 28, 28, 28, C8077mf.B, C8077mf.H, 28, 28, C8077mf.H, 28, 28, 28, 28, 28, 28, 28, 28, C8077mf.H, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, C8077mf.n, 13, 6, 8, C8077mf.m, 10, 10, 8, C8077mf.m, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, C8077mf.q, 6, C8077mf.n, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, C8077mf.p, 6, C8077mf.q, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, C8077mf.q, C8077mf.m, C8077mf.p, 13, 28, C8077mf.x, C8077mf.z, C8077mf.x, C8077mf.x, C8077mf.z, C8077mf.z, C8077mf.z, C8077mf.A, C8077mf.z, C8077mf.A, C8077mf.A, C8077mf.A, C8077mf.A, C8077mf.A, C8077mf.B, C8077mf.A, C8077mf.B, C8077mf.B, C8077mf.z, C8077mf.A, C8077mf.B, C8077mf.A, C8077mf.A, C8077mf.A, C8077mf.A, C8077mf.y, C8077mf.z, C8077mf.A, C8077mf.z, C8077mf.A, C8077mf.A, C8077mf.B, C8077mf.z, C8077mf.y, C8077mf.x, C8077mf.z, C8077mf.z, C8077mf.A, C8077mf.A, C8077mf.y, C8077mf.A, C8077mf.z, C8077mf.z, C8077mf.B, C8077mf.y, C8077mf.z, C8077mf.A, C8077mf.A, C8077mf.y, C8077mf.y, C8077mf.z, C8077mf.y, C8077mf.A, C8077mf.z, C8077mf.A, C8077mf.A, C8077mf.x, C8077mf.z, C8077mf.z, C8077mf.z, C8077mf.A, C8077mf.z, C8077mf.z, C8077mf.A, C8077mf.D, C8077mf.D, C8077mf.x, 19, C8077mf.z, C8077mf.A, C8077mf.z, C8077mf.C, C8077mf.D, C8077mf.D, C8077mf.D, C8077mf.E, C8077mf.E, C8077mf.D, C8077mf.B, C8077mf.C, 19, C8077mf.y, C8077mf.D, C8077mf.E, C8077mf.E, C8077mf.D, C8077mf.E, C8077mf.B, C8077mf.y, C8077mf.y, C8077mf.D, C8077mf.D, 28, C8077mf.E, C8077mf.E, C8077mf.E, C8077mf.x, C8077mf.B, C8077mf.x, C8077mf.y, C8077mf.z, C8077mf.y, C8077mf.y, C8077mf.A, C8077mf.z, C8077mf.z, C8077mf.C, C8077mf.C, C8077mf.B, C8077mf.B, C8077mf.D, C8077mf.A, C8077mf.D, C8077mf.E, C8077mf.D, C8077mf.D, C8077mf.E, C8077mf.E, C8077mf.E, C8077mf.E, C8077mf.E, 28, C8077mf.E, C8077mf.E, C8077mf.E, C8077mf.E, C8077mf.E, C8077mf.D};
        CODE_BIT_COUNTS = bArr;
        root = new Node();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            INSTANCE.addCode(i, CODES[i], CODE_BIT_COUNTS[i]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i, int i2, int i3) {
        Node node = new Node(i, i3);
        Node node2 = root;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            Node[] children = node2.getChildren();
            C6562gT0.m(children);
            Node node3 = children[i4];
            if (node3 == null) {
                node3 = new Node();
                children[i4] = node3;
            }
            node2 = node3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        Node[] children2 = node2.getChildren();
        C6562gT0.m(children2);
        C4788Ye.M1(children2, node, i6, (1 << i5) + i6);
    }

    public final void decode(@NotNull InterfaceC2677Cq interfaceC2677Cq, long j, @NotNull InterfaceC2579Bq interfaceC2579Bq) {
        C6562gT0.p(interfaceC2677Cq, "source");
        C6562gT0.p(interfaceC2579Bq, "sink");
        Node node = root;
        int i = 0;
        int i2 = 0;
        for (long j2 = 0; j2 < j; j2++) {
            i = (i << 8) | Util.and(interfaceC2677Cq.readByte(), 255);
            i2 += 8;
            while (i2 >= 8) {
                Node[] children = node.getChildren();
                C6562gT0.m(children);
                node = children[(i >>> (i2 - 8)) & 255];
                C6562gT0.m(node);
                if (node.getChildren() == null) {
                    interfaceC2579Bq.writeByte(node.getSymbol());
                    i2 -= node.getTerminalBitCount();
                    node = root;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            Node[] children2 = node.getChildren();
            C6562gT0.m(children2);
            Node node2 = children2[(i << (8 - i2)) & 255];
            C6562gT0.m(node2);
            if (node2.getChildren() == null && node2.getTerminalBitCount() <= i2) {
                interfaceC2579Bq.writeByte(node2.getSymbol());
                i2 -= node2.getTerminalBitCount();
                node = root;
            } else {
                return;
            }
        }
    }

    public final void encode(@NotNull C8859ps c8859ps, @NotNull InterfaceC2579Bq interfaceC2579Bq) throws IOException {
        C6562gT0.p(c8859ps, "source");
        C6562gT0.p(interfaceC2579Bq, "sink");
        int g0 = c8859ps.g0();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < g0; i2++) {
            int and = Util.and(c8859ps.v(i2), 255);
            int i3 = CODES[and];
            byte b = CODE_BIT_COUNTS[and];
            j = (j << b) | i3;
            i += b;
            while (i >= 8) {
                i = (i == true ? 1 : 0) - 8;
                interfaceC2579Bq.writeByte((int) (j >> i));
            }
        }
        if (i > 0) {
            interfaceC2579Bq.writeByte((int) ((j << (8 - i)) | (255 >>> i)));
        }
    }

    public final int encodedLength(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "bytes");
        int g0 = c8859ps.g0();
        long j = 0;
        for (int i = 0; i < g0; i++) {
            j += CODE_BIT_COUNTS[Util.and(c8859ps.v(i), 255)];
        }
        return (int) ((j + 7) >> 3);
    }

    /* loaded from: classes4.dex */
    public static final class Node {
        @Nullable
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        @Nullable
        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i, int i2) {
            this.children = null;
            this.symbol = i;
            int i3 = i2 & 7;
            this.terminalBitCount = i3 == 0 ? 8 : i3;
        }
    }
}
