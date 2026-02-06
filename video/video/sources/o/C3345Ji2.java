package o;

import android.media.MediaCodec;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.T12;

/* renamed from: o.Ji2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3345Ji2 {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public final boolean a;

    public C3345Ji2() {
        boolean z;
        if (U20.a(C7103ii2.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    public static /* synthetic */ int a(C3345Ji2 c3345Ji2, T12.e eVar, T12.e eVar2) {
        c3345Ji2.getClass();
        return c3345Ji2.b(eVar.e()) - c3345Ji2.b(eVar2.e());
    }

    public final int b(D10 d10) {
        if (d10.g() == MediaCodec.class) {
            return 2;
        }
        if (d10.g() == androidx.camera.core.k.class) {
            return 0;
        }
        return 1;
    }

    public void c(List<T12.e> list) {
        if (!this.a) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: o.Ii2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3345Ji2.a(C3345Ji2.this, (T12.e) obj, (T12.e) obj2);
            }
        });
    }
}
