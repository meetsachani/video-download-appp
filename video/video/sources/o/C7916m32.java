package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

@ES1(33)
/* renamed from: o.m32  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7916m32 extends AbstractC7187j32 {

    /* renamed from: o.m32$a */
    /* loaded from: classes3.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (!C7916m32.this.e.isEmpty()) {
                outline.setPath(C7916m32.this.e);
            }
        }
    }

    public C7916m32(@InterfaceC5670cr1 View view) {
        l(view);
    }

    @K40
    private void l(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // o.AbstractC7187j32
    public void b(@InterfaceC5670cr1 View view) {
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // o.AbstractC7187j32
    public boolean j() {
        return this.a;
    }
}
