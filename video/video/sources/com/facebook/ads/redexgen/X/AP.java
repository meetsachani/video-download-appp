package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.AD1;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.C9680tD0;
import o.ED2;
import o.QC1;

@MetaExoPlayerCustomization("OculusDefaultDataSource extends this class and hence cannot be final")
/* loaded from: assets/audience_network/classes2.dex */
public final class AP implements InterfaceC2178pF {
    public static byte[] A0B;
    public static String[] A0C = {"tGdrGbTKqUAyZjAtECCaXso437TIFtay", "xasvTmVCH4LeG7al8p8ObQF4UIpko", "linuVDi59rGKxPba8cSgrQfx0g5xcZS0", "EsZJycHVVsXuEv", "at8NLtJKkPgo1aJyGFOZsbSRJOLI96cu", "TOIRSmJtL8rNzzbss9LVqHyYWtEEJZpF", "R6ga9urJMlxgk01j3rMsq3yEpAD", "8pNo6y0"};
    public InterfaceC2178pF A00;
    public InterfaceC2178pF A01;
    public InterfaceC2178pF A02;
    public InterfaceC2178pF A03;
    public InterfaceC2178pF A04;
    public InterfaceC2178pF A05;
    public InterfaceC2178pF A06;
    @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public InterfaceC2178pF A07;
    public final InterfaceC2178pF A08;
    @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public final Context A09;
    @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public final List<InterfaceC05015t> A0A = new ArrayList();

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{C8077mf.B, 86, 89, 83, 69, 88, 94, 83, 104, 86, 68, 68, 82, 67, C8077mf.B, 76, 121, 121, 104, 96, 125, 121, 100, 99, 106, C3307Iz.e0, 121, 98, C3307Iz.e0, 125, 97, 108, 116, C3307Iz.e0, 95, 89, 64, 93, C3307Iz.e0, 126, 121, Byte.MAX_VALUE, 104, 108, 96, C3307Iz.e0, 122, 100, 121, 101, 98, QC1.w, 121, C3307Iz.e0, 105, 104, 125, 104, 99, 105, 100, 99, 106, C3307Iz.e0, 98, 99, C3307Iz.e0, 121, 101, 104, C3307Iz.e0, 95, 89, 64, 93, C3307Iz.e0, 104, 117, 121, 104, 99, 126, 100, 98, 99, 83, 114, 113, 118, 98, 123, 99, 83, 118, 99, 118, 68, QC1.w, 98, 101, 116, 114, 7, 48, 48, C3307Iz.e0, 48, 98, C3307Iz.c0, C3307Iz.d0, 49, 54, 35, C3307Iz.d0, 54, C3307Iz.c0, 35, 54, C3307Iz.c0, C3307Iz.d0, C3307Iz.X, 98, C8077mf.r, C8077mf.z, C8077mf.q, C8077mf.u, 98, C3307Iz.Z, 58, 54, C3307Iz.Z, C3307Iz.d0, 49, C3307Iz.c0, C3307Iz.e0, C3307Iz.d0, 70, 73, 67, 85, 72, 78, 67, 9, 85, 66, 84, 72, 82, 85, 68, 66, 48, 34, 34, 52, C3307Iz.X, C3307Iz.Y, 42, 40, 107, 35, 36, C3307Iz.Y, 32, C3307Iz.Z, 42, 42, C3307Iz.f0, 107, 36, C3307Iz.V, 54, 107, 34, 42, 42, 34, C3307Iz.a0, 32, 107, 36, C3307Iz.c0, C3307Iz.V, 55, 42, C3307Iz.d0, C3307Iz.V, 107, 32, C4715Xk.i, 42, 53, C3307Iz.a0, 36, 60, 32, 55, 119, 107, 32, C4715Xk.i, 49, 107, 55, 49, 40, 53, 107, C8077mf.A, 49, 40, 53, 1, 36, 49, 36, C8077mf.z, 42, 48, 55, C3307Iz.Y, 32, C8077mf.n, 0, 1, C8077mf.E, 10, 1, C8077mf.E, ED2.a, 58, 47, 58, 51, 32, 54, 51, 36, 50, C3307Iz.f0, 52, 51, 34, 36, 75, 77, 84, 73, 70, 87, 67};
    }

    static {
        A08();
    }

    public AP(Context context, InterfaceC2178pF interfaceC2178pF) {
        this.A09 = context.getApplicationContext();
        this.A08 = (InterfaceC2178pF) AbstractC04543y.A01(interfaceC2178pF);
    }

    private InterfaceC2178pF A00() {
        if (this.A00 == null) {
            final Context context = this.A09;
            this.A00 = new AQ(context) { // from class: com.facebook.ads.redexgen.X.1n
                public static byte[] A05;
                public static String[] A06 = {"PTz87XAKzq7jvDXOa", "sgpUZ", "Bde9N92B9PLOW1wkk", "DRZuAIPcc", "gakZC5ePxUI2GDKV9", "pz9vQcEWFJbuREE6smExYo368tZlwkrG", "j43UPSzsV7IrH", "51Zh85ddLdY4jrUIDlK8L"};
                public long A00;
                public Uri A01;
                public InputStream A02;
                public boolean A03;
                public final AssetManager A04;

                public static String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        int i5 = (copyOfRange[i4] ^ i3) ^ 113;
                        String[] strArr = A06;
                        if (strArr[2].length() != strArr[4].length()) {
                            throw new RuntimeException();
                        }
                        A06[1] = "rCVU";
                        copyOfRange[i4] = (byte) i5;
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A05 = new byte[]{124, 116, 58, 53, ED2.a, C3307Iz.a0, 52, 50, ED2.a, 4, 58, 40, 40, 62, 47, 116};
                }

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException
                 */
                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final long AGi(C04905i c04905i) throws C2180pH {
                    try {
                        this.A01 = c04905i.A06;
                        String str = (String) AbstractC04543y.A01(this.A01.getPath());
                        boolean startsWith = str.startsWith(A00(1, 15, 42));
                        String[] strArr = A06;
                        if (strArr[2].length() == strArr[4].length()) {
                            String[] strArr2 = A06;
                            strArr2[2] = "3xdRIl55zUe0UeQhp";
                            strArr2[4] = "pS29hwepCfn47vExr";
                            if (startsWith) {
                                str = str.substring(15);
                            } else if (str.startsWith(A00(0, 1, 34))) {
                                str = str.substring(1);
                            }
                            A0G(c04905i);
                            this.A02 = this.A04.open(str, 1);
                            if (this.A02.skip(c04905i.A04) >= c04905i.A04) {
                                if (c04905i.A03 != -1) {
                                    this.A00 = c04905i.A03;
                                } else {
                                    this.A00 = this.A02.available();
                                    if (this.A00 == 2147483647L) {
                                        this.A00 = -1L;
                                    }
                                }
                                this.A03 = true;
                                A0H(c04905i);
                                return this.A00;
                            }
                            throw new C2180pH(null, 2008);
                        }
                    } catch (C2180pH e) {
                        throw e;
                    } catch (IOException e2) {
                        boolean z = e2 instanceof FileNotFoundException;
                        if (A06[6].length() == 13) {
                            A06[6] = "P3wDYI6sXfUMf";
                            throw new C2180pH(e2, z ? AD1.h1 : 2000);
                        }
                    }
                    throw new RuntimeException();
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A04 = context.getAssets();
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final Uri A9P() {
                    return this.A01;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final void close() throws C2180pH {
                    this.A01 = null;
                    try {
                        try {
                            if (this.A02 != null) {
                                this.A02.close();
                            }
                        } catch (IOException e) {
                            throw new C2180pH(e, 2000);
                        }
                    } finally {
                        this.A02 = null;
                        if (this.A03) {
                            this.A03 = false;
                            A0E();
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
                public final int read(byte[] bArr, int i, int i2) throws C2180pH {
                    if (i2 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i2 = (int) Math.min(this.A00, i2);
                        }
                        int read = ((InputStream) C5C.A0f(this.A02)).read(bArr, i, i2);
                        if (read == -1) {
                            return -1;
                        }
                        long j = this.A00;
                        if (A06[6].length() != 13) {
                            throw new RuntimeException();
                        }
                        A06[6] = "7Z6S4bUZVA19c";
                        int bytesRead = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                        if (bytesRead != 0) {
                            this.A00 -= read;
                        }
                        A0F(read);
                        return read;
                    } catch (IOException e) {
                        throw new C2180pH(e, 2000);
                    }
                }
            };
            A09(this.A00);
        }
        return this.A00;
    }

    private InterfaceC2178pF A01() {
        if (this.A01 == null) {
            final Context context = this.A09;
            this.A01 = new AQ(context) { // from class: com.facebook.ads.redexgen.X.1m
                public static byte[] A06;
                public static String[] A07 = {"2ftN4rqyMzReasXlS0Bd7yvXq4Z2w8Rd", "SB3v1XRSpovCjfjTdx7anKa7xqXJKcRT", "XVjCn6r7eDTGJtLvngTS2wgt8nCOhnB8", "1Z3zzaFrxDlwod4BzGavHrSG6vNvtkR5", "UgcL11Y1AQOJlkVRTNTymNMOAMwNhJW2", "NkTGPgJcqOjwrAzhjPkYXMY7OTNaeVTG", "UuxCrg9I54LtW8vlxqROWB7HyIfBI135", "4rxicH75x32fMwhdD1obBcUBdLwTm4oP"};
                public long A00;
                public AssetFileDescriptor A01;
                public Uri A02;
                public FileInputStream A03;
                public boolean A04;
                public final ContentResolver A05;

                public static String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A06 = new byte[]{-76, -71, -76, 10, 54, 60, 51, C3307Iz.c0, -25, 53, 54, 59, -25, 54, 55, C3307Iz.d0, 53, -25, C3307Iz.e0, 48, 51, C3307Iz.d0, -25, C3307Iz.c0, C3307Iz.d0, 58, 42, 57, 48, 55, 59, 54, 57, -25, C3307Iz.e0, 54, 57, 1, -25, C8077mf.n, C8077mf.C, C8077mf.q, C8077mf.G, C8077mf.D, C8077mf.x, C8077mf.q, C2638Cg0.E7, C8077mf.E, C8077mf.G, C8077mf.D, C3307Iz.V, C8077mf.x, C8077mf.q, C8077mf.r, C8077mf.G, C2638Cg0.E7, C8077mf.r, 35, 31, C8077mf.G, C8077mf.n, C2638Cg0.E7, -20, -18, -18, -16, -5, -1, 10, -6, -3, -12, -14, -12, -7, -20, -9, 10, -8, -16, -17, -12, -20, 10, -15, -6, -3, -8, -20, -1, -70, C2638Cg0.t7, C2638Cg0.s7, C2638Cg0.x7, -68, C2638Cg0.s7, C2638Cg0.x7, 1};
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
                    if (r3 >= 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
                    if (r3 >= 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
                    if (r3 >= 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
                    if (r3 >= 0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
                    throw new com.facebook.ads.redexgen.X.C2179pG(null, 2008);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
                    throw new com.facebook.ads.redexgen.X.C2179pG(null, 2008);
                 */
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
                 */
                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long AGi(C04905i c04905i) throws C2179pG {
                    AssetFileDescriptor openAssetFileDescriptor;
                    try {
                        try {
                            Uri uri = c04905i.A06;
                            this.A02 = uri;
                            A0G(c04905i);
                            if (A00(90, 7, 0).equals(c04905i.A06.getScheme())) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean(A00(39, 51, 84), true);
                                openAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(uri, A00(0, 3, 51), bundle);
                            } else {
                                openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(97, 1, 56));
                            }
                            this.A01 = openAssetFileDescriptor;
                            if (openAssetFileDescriptor == null) {
                                try {
                                    throw new C2179pG(new IOException(A00(3, 36, 112) + uri), 2000);
                                } catch (IOException e) {
                                    e = e;
                                    throw new C2179pG(e, e instanceof FileNotFoundException ? AD1.h1 : 2000);
                                }
                            }
                            long length = openAssetFileDescriptor.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                            this.A03 = fileInputStream;
                            if (length == -1 || c04905i.A04 <= length) {
                                long startOffset = openAssetFileDescriptor.getStartOffset();
                                long skip = fileInputStream.skip(c04905i.A04 + startOffset) - startOffset;
                                int i = (skip > c04905i.A04 ? 1 : (skip == c04905i.A04 ? 0 : -1));
                                String[] strArr = A07;
                                if (strArr[0].charAt(30) == strArr[3].charAt(30)) {
                                    String[] strArr2 = A07;
                                    strArr2[7] = "V2cYJorATJJITl96mEL4teMpahqL5My0";
                                    strArr2[2] = "81QpsL8o4R3JZzZywbg9Kxgu0WDTOmHd";
                                    if (i != 0) {
                                        throw new C2179pG(null, 2008);
                                    }
                                    if (length == -1) {
                                        FileChannel channel = fileInputStream.getChannel();
                                        long size = channel.size();
                                        if (size == 0) {
                                            this.A00 = -1L;
                                        } else {
                                            this.A00 = size - channel.position();
                                            int i2 = (this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1));
                                            if (A07[5].charAt(20) != 'X') {
                                                String[] strArr3 = A07;
                                                strArr3[7] = "o4lencYzmcLYt1MiV6fFEBYqoofjVCYJ";
                                                strArr3[2] = "LnRaAWOGUoCClb3L4bo6XdN18ipe8ADC";
                                            } else {
                                                A07[1] = "bSHOsa59vSpVf4yTu8YpmIN0mXabJXNA";
                                            }
                                        }
                                    } else {
                                        this.A00 = length - skip;
                                        int i3 = (this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1));
                                        if (A07[5].charAt(20) != 'X') {
                                            A07[5] = "bEcLXKtmUZe87exD27VZX6tOwUTS9Sez";
                                        } else {
                                            A07[1] = "HQINqvWzgwxijb9Tl3Os5Fu0qA3gaNYz";
                                        }
                                    }
                                    long j = c04905i.A03;
                                    if (A07[5].charAt(20) == 'X') {
                                        String[] strArr4 = A07;
                                        strArr4[0] = "HMZNFKbBHMEnP71uJIxHqXthvd44tlRl";
                                        strArr4[3] = "eoHh6GrHY21TbtSwRzT9Dqoif9pbqNR5";
                                        if (j != -1) {
                                            this.A00 = this.A00 == -1 ? c04905i.A03 : Math.min(this.A00, c04905i.A03);
                                        }
                                        this.A04 = true;
                                        A0H(c04905i);
                                        return c04905i.A03 != -1 ? c04905i.A03 : this.A00;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            throw new C2179pG(null, 2008);
                        } catch (C2179pG e2) {
                            throw e2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A05 = context.getContentResolver();
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final Uri A9P() {
                    return this.A02;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final void close() throws C2179pG {
                    this.A02 = null;
                    try {
                        try {
                            if (this.A03 != null) {
                                this.A03.close();
                            }
                            this.A03 = null;
                            try {
                                try {
                                    if (this.A01 != null) {
                                        this.A01.close();
                                    }
                                } catch (IOException e) {
                                    throw new C2179pG(e, 2000);
                                }
                            } finally {
                                this.A01 = null;
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                            }
                        } catch (IOException e2) {
                            throw new C2179pG(e2, 2000);
                        }
                    } catch (Throwable th) {
                        this.A03 = null;
                        try {
                            try {
                                if (this.A01 != null) {
                                    this.A01.close();
                                }
                                this.A01 = null;
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                                throw th;
                            } catch (IOException e3) {
                                throw new C2179pG(e3, 2000);
                            }
                        } finally {
                            this.A01 = null;
                            if (this.A04) {
                                this.A04 = false;
                                A0E();
                            }
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
                public final int read(byte[] bArr, int i, int i2) throws C2179pG {
                    if (i2 == 0) {
                        return 0;
                    }
                    long j = this.A00;
                    if (A07[1].charAt(15) != 'T') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A07;
                    strArr[0] = "xrRDl1n0HP8M9562uVsbLDb97IGJJORF";
                    strArr[3] = "BxGqKYmJPgWUa88HGr5IfMWzChfrhfRY";
                    if (j == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i2 = (int) Math.min(this.A00, i2);
                        }
                        int read = ((FileInputStream) C5C.A0f(this.A03)).read(bArr, i, i2);
                        if (read == -1) {
                            return -1;
                        }
                        int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                        if (bytesRead != 0) {
                            this.A00 -= read;
                        }
                        A0F(read);
                        return read;
                    } catch (IOException e) {
                        throw new C2179pG(e, 2000);
                    }
                }
            };
            A09(this.A01);
        }
        return this.A01;
    }

    private InterfaceC2178pF A02() {
        if (this.A02 == null) {
            this.A02 = new AQ() { // from class: com.facebook.ads.redexgen.X.1l
                public static byte[] A04;
                public int A00;
                public int A01;
                public C04905i A02;
                public byte[] A03;

                static {
                    A01();
                }

                public static String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A04 = new byte[]{-17, 48, 87, 86, 104, 90, C3307Iz.c0, C3307Iz.a0, 58, 103, 103, 100, 103, C8077mf.y, 108, 93, 94, 97, 90, C8077mf.y, 101, 86, 103, 104, 94, 99, 92, C8077mf.y, 55, 86, 104, 90, C3307Iz.c0, C3307Iz.a0, C8077mf.y, 90, 99, 88, 100, 89, 90, 89, C8077mf.y, 104, 105, 103, 94, 99, 92, 47, C8077mf.y, -23, 2, -7, C8077mf.n, 4, -7, -9, 8, -7, -8, -76, -23, -26, -35, -76, -6, 3, 6, 1, -11, 8, C2638Cg0.z7, -76, 60, 85, 90, 92, 87, 87, 86, 89, 91, 76, 75, 7, 90, 74, 79, 76, 84, 76, C3307Iz.V, 7, C8077mf.C, C8077mf.z, C3307Iz.a0, C8077mf.z};
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final Uri A9P() {
                    if (this.A02 != null) {
                        return this.A02.A06;
                    }
                    return null;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final long AGi(C04905i c04905i) throws IOException {
                    A0G(c04905i);
                    this.A02 = c04905i;
                    Uri uri = c04905i.A06;
                    String scheme = uri.getScheme();
                    AbstractC04543y.A09(A00(94, 4, 61).equals(scheme), A00(74, 20, 111) + scheme);
                    String[] uriParts = C5C.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 75));
                    if (uriParts.length == 2) {
                        String str = uriParts[1];
                        String dataString = uriParts[0];
                        if (dataString.contains(A00(1, 7, 125))) {
                            try {
                                this.A03 = Base64.decode(str, 0);
                            } catch (IllegalArgumentException e) {
                                throw C3K.A02(A00(8, 43, 125) + str, e);
                            }
                        } else {
                            this.A03 = C5C.A1G(URLDecoder.decode(str, AbstractC1879k9.A01.name()));
                        }
                        if (c04905i.A04 <= this.A03.length) {
                            this.A01 = (int) c04905i.A04;
                            this.A00 = this.A03.length - this.A01;
                            if (c04905i.A03 != -1) {
                                this.A00 = (int) Math.min(this.A00, c04905i.A03);
                            }
                            A0H(c04905i);
                            return c04905i.A03 != -1 ? c04905i.A03 : this.A00;
                        }
                        this.A03 = null;
                        throw new C04835b(2008);
                    }
                    throw C3K.A02(A00(51, 23, 28) + uri, null);
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final void close() {
                    if (this.A03 != null) {
                        this.A03 = null;
                        A0E();
                    }
                    this.A02 = null;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
                public final int read(byte[] bArr, int i, int i2) {
                    if (i2 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    int min = Math.min(i2, this.A00);
                    System.arraycopy(C5C.A0f(this.A03), this.A01, bArr, i, min);
                    this.A01 += min;
                    this.A00 -= min;
                    A0F(min);
                    return min;
                }
            };
            A09(this.A02);
        }
        return this.A02;
    }

    private InterfaceC2178pF A03() {
        if (this.A03 == null) {
            this.A03 = new C03911j();
            A09(this.A03);
        }
        return this.A03;
    }

    private InterfaceC2178pF A04() {
        if (this.A04 == null) {
            final Context context = this.A09;
            this.A04 = new AQ(context) { // from class: com.facebook.ads.redexgen.X.1i
                public static byte[] A07;
                public static String[] A08 = {"QLuP8Pt4KiB", "RgtlFkBshe2uzsEMObMvf6GLE9oju0kX", "TTP1lITjIL7gpSd4kE", "ZIRCIqgztw3RRTH34yg2MmGGdHBG3Sqw", "W8lxrl5W", "1BP9Supp2XIZ7aBeV", "CPoLKetsO3XScG5XHhoA5", "r"};
                public long A00;
                public AssetFileDescriptor A01;
                public Uri A02;
                public InputStream A03;
                public boolean A04;
                public final Resources A05;
                public final String A06;

                public static String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A07 = new byte[]{105, 54, 72, 99, 105, C3307Iz.e0, 98, 107, C3307Iz.e0, 126, 121, Byte.MAX_VALUE, 104, 108, 96, C3307Iz.e0, Byte.MAX_VALUE, 104, 108, 110, 101, 104, 105, C3307Iz.e0, 101, 108, 123, 100, 99, 106, C3307Iz.e0, 99, 98, 121, C3307Iz.e0, Byte.MAX_VALUE, 104, 108, 105, C3307Iz.e0, 126, QC1.w, 107, 107, 100, 110, 100, 104, 99, 121, C3307Iz.e0, 105, 108, 121, 108, 35, 122, 77, 91, 71, 93, 90, 75, 77, 8, 65, 76, 77, 70, 92, 65, 78, 65, 77, 90, 8, 69, 93, 91, 92, 8, 74, 77, 8, 73, 70, 8, 65, 70, 92, 77, 79, 77, 90, 6, C8077mf.E, C3307Iz.d0, 58, C3307Iz.Y, 60, 59, 42, C3307Iz.d0, 105, 32, 58, 105, 42, C3307Iz.Y, 36, 57, 59, C3307Iz.d0, 58, 58, C3307Iz.d0, C3307Iz.e0, 115, 105, 50, 5, 19, C8077mf.q, C8077mf.y, C8077mf.u, 3, 5, 64, C8077mf.p, C8077mf.q, C8077mf.x, 64, 6, C8077mf.q, C8077mf.y, C8077mf.p, 4, 78, 115, 116, 111, 6, 75, 83, 85, 82, 6, 67, 79, 82, 78, 67, 84, 6, 83, 85, 67, 6, 85, 69, 78, 67, 75, 67, 6, 84, 71, 81, 84, 67, 85, 73, 83, 84, 69, 67, 6, 73, 84, 6, 71, 72, 66, 84, 73, 79, 66, 8, 84, 67, 85, 73, 83, 84, 69, 67, 114, 74, 5, 98, 109, 103, 113, 108, 106, 103, C3307Iz.e0, 113, 102, 112, 108, 118, 113, 96, 102, 69, 86, 64, 92, 79, 89, 92, 75, 93, 65, 91, 92, 77, 75};
                }

                /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
                    throw new com.facebook.ads.redexgen.X.C2166p3(A00(119, 19, 31), null, o.AD1.h1);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00f7, code lost:
                    if (r1 != 0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
                    if (r1 != 0) goto L23;
                 */
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException
                 */
                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long AGi(C04905i c04905i) throws C2166p3 {
                    int parseInt;
                    C03901i c03901i;
                    String host;
                    Uri uri = c04905i.A06;
                    this.A02 = uri;
                    try {
                        try {
                            if (!TextUtils.equals(A00(C9276rZ.l, 11, 81), uri.getScheme())) {
                                String scheme = uri.getScheme();
                                String[] strArr = A08;
                                if (strArr[1].charAt(14) != strArr[3].charAt(14)) {
                                    String[] strArr2 = A08;
                                    strArr2[4] = "6WAfCQCC";
                                    strArr2[5] = "2bXUndVpRAzh6SBol";
                                    String A00 = A00(199, 16, 124);
                                    if (!TextUtils.equals(A00, scheme) || uri.getPathSegments().size() != 1 || !((String) AbstractC04543y.A01(uri.getLastPathSegment())).matches(A00(196, 3, 81))) {
                                        if (!TextUtils.equals(A00, uri.getScheme())) {
                                            throw new C2166p3(A00(138, 58, 89), null, 1004);
                                        }
                                        String str = (String) AbstractC04543y.A01(uri.getPath());
                                        if (str.startsWith(A00(0, 1, 57))) {
                                            str = str.substring(1);
                                        }
                                        String str2 = (TextUtils.isEmpty(uri.getHost()) ? A00(0, 0, 29) : host + A00(1, 1, 115)) + str;
                                        Resources resources = this.A05;
                                        String str3 = this.A06;
                                        if (A08[6].length() != 1) {
                                            String[] strArr3 = A08;
                                            strArr3[1] = "8DRS4lLYfMrToLqDwLXqvfchHPsueWE2";
                                            strArr3[3] = "vCWitTtlDB9EwPvV6O7ut3igyg5fSS64";
                                            parseInt = resources.getIdentifier(str2, A00(C10997yd1.z1, 3, 72), str3);
                                        } else {
                                            String[] strArr4 = A08;
                                            strArr4[7] = C2638Cg0.W4;
                                            strArr4[2] = "wipKq4bcm9KT4pACcA";
                                            parseInt = resources.getIdentifier(str2, A00(10, 1, 58), str3);
                                        }
                                    }
                                }
                                throw new RuntimeException();
                            }
                            AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                            this.A01 = openRawResourceFd;
                            if (openRawResourceFd == null) {
                                throw new C2166p3(A00(95, 24, 54) + uri, null, 2000);
                            }
                            long length = openRawResourceFd.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.A03 = fileInputStream;
                            if (length != -1) {
                                try {
                                    if (c04905i.A04 > length) {
                                        throw new C2166p3(null, null, 2008);
                                    }
                                } catch (C2166p3 e) {
                                    throw e;
                                } catch (IOException e2) {
                                    e = e2;
                                    throw new C2166p3(null, e, 2000);
                                }
                            }
                            try {
                                long startOffset = openRawResourceFd.getStartOffset();
                                long skip = fileInputStream.skip(c04905i.A04 + startOffset) - startOffset;
                                try {
                                    try {
                                        if (skip == c04905i.A04) {
                                            if (length == -1) {
                                                FileChannel channel = fileInputStream.getChannel();
                                                if (channel.size() == 0) {
                                                    c03901i = this;
                                                    c03901i.A00 = -1L;
                                                } else {
                                                    c03901i = this;
                                                    c03901i.A00 = channel.size() - channel.position();
                                                    if (c03901i.A00 < 0) {
                                                        throw new C2166p3(null, null, 2008);
                                                    }
                                                }
                                            } else {
                                                c03901i = this;
                                                c03901i.A00 = length - skip;
                                                if (c03901i.A00 < 0) {
                                                    throw new C04835b(2008);
                                                }
                                            }
                                            long j = c04905i.A03;
                                            String[] strArr5 = A08;
                                            if (strArr5[7].length() != strArr5[2].length()) {
                                                A08[0] = "f";
                                                if (j != -1) {
                                                    c03901i.A00 = c03901i.A00 == -1 ? c04905i.A03 : Math.min(c03901i.A00, c04905i.A03);
                                                }
                                                c03901i.A04 = true;
                                                A0H(c04905i);
                                                return c04905i.A03 != -1 ? c04905i.A03 : c03901i.A00;
                                            }
                                            throw new RuntimeException();
                                        }
                                        throw new C2166p3(null, null, 2008);
                                    } catch (C2166p3 e3) {
                                        throw e3;
                                    } catch (IOException e4) {
                                        e = e4;
                                        throw new C2166p3(null, e, 2000);
                                    }
                                } catch (C2166p3 e5) {
                                    throw e5;
                                } catch (IOException e6) {
                                    e = e6;
                                }
                            } catch (C2166p3 e7) {
                                throw e7;
                            } catch (IOException e8) {
                                e = e8;
                            }
                        } catch (Resources.NotFoundException e9) {
                            throw new C2166p3(null, e9, AD1.h1);
                        }
                        parseInt = Integer.parseInt((String) AbstractC04543y.A01(uri.getLastPathSegment()));
                        A0G(c04905i);
                    } catch (NumberFormatException unused) {
                        throw new C2166p3(A00(56, 39, 87), null, 1004);
                    }
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A05 = context.getResources();
                    this.A06 = context.getPackageName();
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final Uri A9P() {
                    return this.A02;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
                public final void close() throws C2166p3 {
                    this.A02 = null;
                    try {
                        try {
                            if (this.A03 != null) {
                                this.A03.close();
                            }
                            this.A03 = null;
                            try {
                                try {
                                    if (this.A01 != null) {
                                        this.A01.close();
                                    }
                                } catch (IOException e) {
                                    throw new C2166p3(null, e, 2000);
                                }
                            } catch (Throwable th) {
                                this.A01 = null;
                                String[] strArr = A08;
                                if (strArr[1].charAt(14) == strArr[3].charAt(14)) {
                                    throw new RuntimeException();
                                }
                                A08[6] = "iC26zNxzLLnB2GH7qyOIGlAQhGgRPuU";
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            throw new C2166p3(null, e2, 2000);
                        }
                    } catch (Throwable th2) {
                        this.A03 = null;
                        try {
                            try {
                                if (this.A01 != null) {
                                    this.A01.close();
                                }
                                this.A01 = null;
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                                throw th2;
                            } catch (IOException e3) {
                                throw new C2166p3(null, e3, 2000);
                            }
                        } finally {
                            this.A01 = null;
                            if (this.A04) {
                                this.A04 = false;
                                A0E();
                            }
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
                public final int read(byte[] bArr, int i, int i2) throws C2166p3 {
                    if (i2 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i2 = (int) Math.min(this.A00, i2);
                        }
                        int read = ((InputStream) C5C.A0f(this.A03)).read(bArr, i, i2);
                        if (read == -1) {
                            if (this.A00 == -1) {
                                return -1;
                            }
                            throw new C2166p3(A00(2, 54, 114), new EOFException(), 2000);
                        }
                        if (this.A00 != -1) {
                            this.A00 -= read;
                        }
                        A0F(read);
                        return read;
                    } catch (IOException e) {
                        throw new C2166p3(null, e, 2000);
                    }
                }
            };
            A09(this.A04);
        }
        return this.A04;
    }

    private InterfaceC2178pF A05() {
        if (this.A05 == null) {
            try {
                this.A05 = (InterfaceC2178pF) Class.forName(A07(C3503Kz.q0, 66, 67)).getConstructor(new Class[0]).newInstance(new Object[0]);
                A09(this.A05);
            } catch (ClassNotFoundException unused) {
                AbstractC04624g.A07(A07(85, 17, 17), A07(15, 70, 11));
            } catch (Exception e) {
                throw new RuntimeException(A07(102, 34, 68), e);
            }
            if (this.A05 == null) {
                this.A05 = this.A08;
            }
        }
        return this.A05;
    }

    private InterfaceC2178pF A06() {
        if (this.A06 == null) {
            this.A06 = new C03891h();
            A09(this.A06);
        }
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(InterfaceC2178pF interfaceC2178pF) {
        for (int i = 0; i < i; i++) {
            interfaceC2178pF.A43(this.A0A.get(i));
        }
    }

    private void A0A(InterfaceC2178pF interfaceC2178pF, InterfaceC05015t interfaceC05015t) {
        if (interfaceC2178pF != null) {
            interfaceC2178pF.A43(interfaceC05015t);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final void A43(InterfaceC05015t interfaceC05015t) {
        AbstractC04543y.A01(interfaceC05015t);
        this.A08.A43(interfaceC05015t);
        this.A0A.add(interfaceC05015t);
        A0A(this.A03, interfaceC05015t);
        A0A(this.A00, interfaceC05015t);
        A0A(this.A01, interfaceC05015t);
        A0A(this.A05, interfaceC05015t);
        A0A(this.A06, interfaceC05015t);
        A0A(this.A02, interfaceC05015t);
        A0A(this.A04, interfaceC05015t);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final Map<String, List<String>> A8t() {
        return this.A07 == null ? Collections.emptyMap() : this.A07.A8t();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final Uri A9P() {
        if (this.A07 == null) {
            return null;
        }
        return this.A07.A9P();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final long AGi(C04905i c04905i) throws IOException {
        AbstractC04543y.A08(this.A07 == null);
        String scheme = c04905i.A06.getScheme();
        if (C5C.A1A(c04905i.A06)) {
            String path = c04905i.A06.getPath();
            if (path != null) {
                String[] strArr = A0C;
                String uriPath = strArr[4];
                if (uriPath.charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[4] = "woaZ3GsQ3DbiayOrUPjNVqqq8n8IT0aY";
                strArr2[0] = "klzvMTRWbU3yZvxB9bRoGsioUmbI9kjx";
                String scheme2 = A07(0, 15, 49);
                if (path.startsWith(scheme2)) {
                    InterfaceC2178pF A00 = A00();
                    String[] strArr3 = A0C;
                    String uriPath2 = strArr3[4];
                    if (uriPath2.charAt(27) != strArr3[0].charAt(27)) {
                        String[] strArr4 = A0C;
                        strArr4[1] = "PIVfyqk1Etrv0Wbxq4vDpVOoMCV7O";
                        strArr4[7] = "Bsp2dR1";
                        this.A07 = A00;
                    } else {
                        String[] strArr5 = A0C;
                        strArr5[1] = "maZBVk5L4nnlZEqCNC7SxmxFjkMbb";
                        strArr5[7] = "XTvzFpJ";
                        this.A07 = A00;
                    }
                }
            }
            this.A07 = A03();
        } else {
            String scheme3 = A07(C3503Kz.l0, 5, 87);
            if (scheme3.equals(scheme)) {
                this.A07 = A00();
            } else {
                String scheme4 = A07(223, 7, 105);
                if (scheme4.equals(scheme)) {
                    this.A07 = A01();
                } else {
                    String scheme5 = A07(245, 4, 63);
                    if (scheme5.equals(scheme)) {
                        this.A07 = A05();
                    } else {
                        String scheme6 = A07(C9680tD0.j, 3, 53);
                        if (scheme6.equals(scheme)) {
                            this.A07 = A06();
                        } else {
                            String scheme7 = A07(230, 4, 93);
                            if (scheme7.equals(scheme)) {
                                this.A07 = A02();
                            } else {
                                String scheme8 = A07(234, 11, 71);
                                if (!scheme8.equals(scheme)) {
                                    String scheme9 = A07(136, 16, 33);
                                    if (!scheme9.equals(scheme)) {
                                        this.A07 = this.A08;
                                    }
                                }
                                this.A07 = A04();
                            }
                        }
                    }
                }
            }
        }
        return this.A07.AGi(c04905i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final void close() throws IOException {
        if (this.A07 != null) {
            try {
                this.A07.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return ((InterfaceC2178pF) AbstractC04543y.A01(this.A07)).read(bArr, i, i2);
    }
}
