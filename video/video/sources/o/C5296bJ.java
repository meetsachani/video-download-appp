package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5296bJ {
    public final List<C10823xu2> a = new ArrayList();

    public void a(C10823xu2 c10823xu2) {
        this.a.add(c10823xu2);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            C6006eE2.b(path, this.a.get(size));
        }
    }
}
