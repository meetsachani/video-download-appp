package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: o.Fh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2949Fh2 {
    public static final Size b = new Size(320, 240);
    public static final Comparator<Size> c = new C8474oH();
    public final GR1 a = (GR1) X20.a(GR1.class);

    public Size[] a(Size[] sizeArr) {
        if (this.a != null && GR1.d()) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (c.compare(size, b) >= 0) {
                    arrayList.add(size);
                }
            }
            return (Size[]) arrayList.toArray(new Size[0]);
        }
        return sizeArr;
    }
}
