package o;

import android.os.Bundle;
import java.util.Arrays;
import o.InterfaceC8368nr;

@Deprecated
/* loaded from: classes2.dex */
public final class IF implements InterfaceC8368nr {
    public static final IF a1 = new IF(1, 2, 3, null);
    public static final IF b1 = new b().c(1).b(1).d(2).a();
    public static final String c1 = TD2.R0(0);
    public static final String d1 = TD2.R0(1);
    public static final String e1 = TD2.R0(2);
    public static final String f1 = TD2.R0(3);
    public static final InterfaceC8368nr.a<IF> g1 = new InterfaceC8368nr.a() { // from class: o.HF
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return IF.a(bundle);
        }
    };
    public final int X;
    public final int Y;
    @InterfaceC11300zs1
    public final byte[] Y0;
    public final int Z;
    public int Z0;

    /* loaded from: classes2.dex */
    public static final class b {
        public int a;
        public int b;
        public int c;
        @InterfaceC11300zs1
        public byte[] d;

        public IF a() {
            return new IF(this.a, this.b, this.c, this.d);
        }

        @InterfaceC6181ey
        public b b(int i) {
            this.b = i;
            return this;
        }

        @InterfaceC6181ey
        public b c(int i) {
            this.a = i;
            return this;
        }

        @InterfaceC6181ey
        public b d(int i) {
            this.c = i;
            return this;
        }

        @InterfaceC6181ey
        public b e(@InterfaceC11300zs1 byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public b() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
        }

        public b(IF r2) {
            this.a = r2.X;
            this.b = r2.Y;
            this.c = r2.Z;
            this.d = r2.Y0;
        }
    }

    @Deprecated
    public IF(int i, int i2, int i3, @InterfaceC11300zs1 byte[] bArr) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = bArr;
    }

    public static /* synthetic */ IF a(Bundle bundle) {
        return new IF(bundle.getInt(c1, -1), bundle.getInt(d1, -1), bundle.getInt(e1, -1), bundle.getByteArray(f1));
    }

    public static String c(int i) {
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return "Undefined color range";
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String d(int i) {
        if (i != -1) {
            if (i != 6) {
                if (i != 1) {
                    if (i != 2) {
                        return "Undefined color space";
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String f(int i) {
        if (i != -1) {
            if (i != 10) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 6) {
                                if (i != 7) {
                                    return "Undefined color transfer";
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean g(@InterfaceC11300zs1 IF r1) {
        if (r1 != null) {
            int i = r1.Z;
            if (i == 7 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @JK1
    public static int i(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 9) {
            return 6;
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            return -1;
        }
        return 2;
    }

    @JK1
    public static int j(int i) {
        if (i != 1) {
            if (i != 4) {
                if (i != 13) {
                    if (i == 16) {
                        return 6;
                    }
                    if (i == 18) {
                        return 7;
                    }
                    if (i != 6 && i != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public b b() {
        return new b();
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1, this.X);
        bundle.putInt(d1, this.Y);
        bundle.putInt(e1, this.Z);
        bundle.putByteArray(f1, this.Y0);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IF.class == obj.getClass()) {
            IF r5 = (IF) obj;
            if (this.X == r5.X && this.Y == r5.Y && this.Z == r5.Z && Arrays.equals(this.Y0, r5.Y0)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        if (this.X != -1 && this.Y != -1 && this.Z != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.Z0 == 0) {
            this.Z0 = ((((((527 + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + Arrays.hashCode(this.Y0);
        }
        return this.Z0;
    }

    public String k() {
        if (!h()) {
            return "NA";
        }
        return TD2.M("%s/%s/%s", d(this.X), c(this.Y), f(this.Z));
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(d(this.X));
        sb.append(C6566gU0.h);
        sb.append(c(this.Y));
        sb.append(C6566gU0.h);
        sb.append(f(this.Z));
        sb.append(C6566gU0.h);
        if (this.Y0 != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(C9811tl1.d);
        return sb.toString();
    }
}
