package o;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: o.Ds  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2783Ds implements Cloneable {
    public static int a1 = 80;
    public static int b1 = 2;
    public final char[] X;
    public C2685Cs Y0;
    public int Z0;
    public long Y = -1;
    public long Z = Long.MAX_VALUE;

    public C2783Ds(char[] cArr) {
        this.X = cArr;
    }

    public boolean B() {
        char[] cArr = this.X;
        if (cArr != null && cArr.length >= 1) {
            return true;
        }
        return false;
    }

    public boolean D() {
        if (this.Z != Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean F() {
        if (this.Y > -1) {
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.Y == -1) {
            return true;
        }
        return false;
    }

    public void H(C2685Cs c2685Cs) {
        this.Y0 = c2685Cs;
    }

    public void J(long j) {
        if (this.Z == Long.MAX_VALUE) {
            this.Z = j;
            if (C3186Hs.d) {
                PrintStream printStream = System.out;
                printStream.println("closing " + hashCode() + B8.d + this);
            }
            C2685Cs c2685Cs = this.Y0;
            if (c2685Cs != null) {
                c2685Cs.U(this);
            }
        }
    }

    public void K(int i) {
        this.Z0 = i;
    }

    public void L(long j) {
        this.Y = j;
    }

    public String M(int i, int i2) {
        return "";
    }

    public String Q() {
        return "";
    }

    public void d(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
    }

    @Override // 
    /* renamed from: e */
    public C2783Ds clone() {
        try {
            return (C2783Ds) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783Ds)) {
            return false;
        }
        C2783Ds c2783Ds = (C2783Ds) obj;
        if (this.Y != c2783Ds.Y || this.Z != c2783Ds.Z || this.Z0 != c2783Ds.Z0 || !Arrays.equals(this.X, c2783Ds.X)) {
            return false;
        }
        return Objects.equals(this.Y0, c2783Ds.Y0);
    }

    public String f() {
        String str = new String(this.X);
        if (str.length() < 1) {
            return "";
        }
        long j = this.Z;
        if (j != Long.MAX_VALUE) {
            long j2 = this.Y;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.Y;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public C2783Ds h() {
        return this.Y0;
    }

    public int hashCode() {
        int i;
        long j = this.Y;
        long j2 = this.Z;
        int hashCode = ((((Arrays.hashCode(this.X) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C2685Cs c2685Cs = this.Y0;
        if (c2685Cs != null) {
            i = c2685Cs.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.Z0;
    }

    public String i() {
        if (C3186Hs.d) {
            return w() + B8.d;
        }
        return "";
    }

    public long j() {
        return this.Z;
    }

    public float k() {
        if (this instanceof C2990Fs) {
            return ((C2990Fs) this).k();
        }
        return Float.NaN;
    }

    public int l() {
        if (this instanceof C2990Fs) {
            return ((C2990Fs) this).l();
        }
        return 0;
    }

    public int p() {
        return this.Z0;
    }

    public long r() {
        return this.Y;
    }

    public String toString() {
        long j = this.Y;
        long j2 = this.Z;
        if (j <= j2 && j2 != Long.MAX_VALUE) {
            String substring = new String(this.X).substring((int) this.Y, ((int) this.Z) + 1);
            return w() + " (" + this.Y + " : " + this.Z + ") <<" + substring + ">>";
        }
        return getClass() + " (INVALID, " + this.Y + "-" + this.Z + C9811tl1.d;
    }

    public String w() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }
}
