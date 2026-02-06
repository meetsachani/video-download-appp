package o;

/* renamed from: o.Hg0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3139Hg0 {
    public boolean a() {
        MM0 mm0 = (MM0) U20.a(MM0.class);
        if (mm0 != null && !mm0.h(C3597Ly.j)) {
            return false;
        }
        return true;
    }

    public boolean b(androidx.camera.core.g gVar) {
        if (a() && gVar.getFormat() == 256) {
            return true;
        }
        return false;
    }
}
