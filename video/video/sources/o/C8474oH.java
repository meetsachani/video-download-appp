package o;

import android.util.Size;
import java.util.Comparator;

/* renamed from: o.oH  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8474oH implements Comparator<Size> {
    public boolean X;

    public C8474oH() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        if (this.X) {
            return signum * (-1);
        }
        return signum;
    }

    public C8474oH(boolean z) {
        this.X = z;
    }
}
