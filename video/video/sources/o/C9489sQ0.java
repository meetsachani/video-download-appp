package o;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import o.C8736pL2;
import o.RL2;

/* renamed from: o.sQ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9489sQ0 extends C8736pL2.b {
    public final View e;
    public int f;
    public int g;
    public final int[] h;

    public C9489sQ0(View view) {
        super(0);
        this.h = new int[2];
        this.e = view;
    }

    @Override // o.C8736pL2.b
    public void b(@InterfaceC5670cr1 C8736pL2 c8736pL2) {
        this.e.setTranslationY(0.0f);
    }

    @Override // o.C8736pL2.b
    public void c(@InterfaceC5670cr1 C8736pL2 c8736pL2) {
        this.e.getLocationOnScreen(this.h);
        this.f = this.h[1];
    }

    @Override // o.C8736pL2.b
    @InterfaceC5670cr1
    public RL2 d(@InterfaceC5670cr1 RL2 rl2, @InterfaceC5670cr1 List<C8736pL2> list) {
        Iterator<C8736pL2> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C8736pL2 next = it.next();
            if ((next.f() & RL2.p.d()) != 0) {
                this.e.setTranslationY(C5600ca.c(this.g, 0, next.d()));
                break;
            }
        }
        return rl2;
    }

    @Override // o.C8736pL2.b
    @InterfaceC5670cr1
    public C8736pL2.a e(@InterfaceC5670cr1 C8736pL2 c8736pL2, @InterfaceC5670cr1 C8736pL2.a aVar) {
        this.e.getLocationOnScreen(this.h);
        int i = this.f - this.h[1];
        this.g = i;
        this.e.setTranslationY(i);
        return aVar;
    }
}
