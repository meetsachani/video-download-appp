package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import o.InterfaceC8136mt2;

/* loaded from: classes.dex */
public class G60 implements InterfaceC8136mt2<Drawable> {
    public final int a;
    public final boolean b;

    public G60(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // o.InterfaceC8136mt2
    /* renamed from: b */
    public boolean a(Drawable drawable, InterfaceC8136mt2.a aVar) {
        Drawable c = aVar.c();
        if (c == null) {
            c = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{c, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        aVar.b(transitionDrawable);
        return true;
    }
}
