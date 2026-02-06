package o;

import android.util.Range;
import android.util.Size;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class PF2 implements NF2 {
    public static final String e = "VideoEncoderInfoWrapper";
    public static final int f = 4096;
    public static final int g = 2160;
    public final NF2 a;
    public final Range<Integer> b;
    public final Range<Integer> c;
    public final Set<Size> d;

    public PF2(NF2 nf2, Size size) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.a = nf2;
        int e2 = nf2.e();
        this.b = Range.create(Integer.valueOf(e2), Integer.valueOf(((int) Math.ceil(4096.0d / e2)) * e2));
        int c = nf2.c();
        this.c = Range.create(Integer.valueOf(c), Integer.valueOf(((int) Math.ceil(2160.0d / c)) * c));
        if (size != null) {
            hashSet.add(size);
        }
        hashSet.addAll(C3719Ne1.d());
    }

    public static NF2 j(NF2 nf2, Size size) {
        if (nf2 instanceof PF2) {
            return nf2;
        }
        if (V20.a(C3719Ne1.class) == null) {
            if (size != null && !nf2.d(size.getWidth(), size.getHeight())) {
                C7433k41.p(e, String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size, nf2.h(), nf2.i()));
            } else {
                return nf2;
            }
        }
        return new PF2(nf2, size);
    }

    @Override // o.NF2
    public Range<Integer> b(int i) {
        boolean z;
        if (this.c.contains((Range<Integer>) Integer.valueOf(i)) && i % this.a.c() == 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Not supported height: " + i + " which is not in " + this.c + " or can not be divided by alignment " + this.a.c());
        return this.b;
    }

    @Override // o.NF2
    public int c() {
        return this.a.c();
    }

    @Override // o.NF2
    public boolean d(int i, int i2) {
        if (!this.d.isEmpty() && this.d.contains(new Size(i, i2))) {
            return true;
        }
        if (this.b.contains((Range<Integer>) Integer.valueOf(i)) && this.c.contains((Range<Integer>) Integer.valueOf(i2)) && i % this.a.e() == 0 && i2 % this.a.c() == 0) {
            return true;
        }
        return false;
    }

    @Override // o.NF2
    public int e() {
        return this.a.e();
    }

    @Override // o.NF2
    public Range<Integer> f() {
        return this.a.f();
    }

    @Override // o.NF2
    public Range<Integer> g(int i) {
        boolean z;
        if (this.b.contains((Range<Integer>) Integer.valueOf(i)) && i % this.a.e() == 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Not supported width: " + i + " which is not in " + this.b + " or can not be divided by alignment " + this.a.e());
        return this.c;
    }

    @Override // o.InterfaceC10506wc0
    public String getName() {
        return this.a.getName();
    }

    @Override // o.NF2
    public Range<Integer> h() {
        return this.b;
    }

    @Override // o.NF2
    public Range<Integer> i() {
        return this.c;
    }
}
