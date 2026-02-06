package o;

import java.io.IOException;

/* renamed from: o.p82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8684p82 {
    public final C3968Ps X;
    public final boolean Y;
    public String[] Z;

    public C8684p82(C3968Ps c3968Ps, boolean z) {
        this.X = c3968Ps;
        this.Y = z;
    }

    public String[] a() {
        String[] strArr = this.Z;
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return strArr2;
        }
        return strArr;
    }

    public long b() {
        return this.X.h();
    }

    public final boolean c() {
        String[] strArr = this.Z;
        if (strArr.length == 0 || (strArr.length == 1 && C4500Ve2.I0(strArr[0]))) {
            return true;
        }
        return false;
    }

    public String[] d() throws IOException, C5817dS {
        do {
            String[] M = this.X.M();
            this.Z = M;
            if (M == null || !c()) {
                break;
            }
        } while (this.Y);
        return a();
    }
}
