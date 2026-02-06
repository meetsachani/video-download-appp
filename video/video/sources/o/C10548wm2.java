package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.wm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10548wm2 {
    public float c;
    public float d;
    @InterfaceC11300zs1
    public C9081qm2 g;
    public final TextPaint a = new TextPaint(1);
    public final AbstractC9573sm2 b = new a();
    public boolean e = true;
    @InterfaceC11300zs1
    public WeakReference<b> f = new WeakReference<>(null);

    /* renamed from: o.wm2$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC9573sm2 {
        public a() {
        }

        @Override // o.AbstractC9573sm2
        public void a(int i) {
            C10548wm2.this.e = true;
            b bVar = (b) C10548wm2.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // o.AbstractC9573sm2
        public void b(@InterfaceC5670cr1 Typeface typeface, boolean z) {
            if (!z) {
                C10548wm2.this.e = true;
                b bVar = (b) C10548wm2.this.f.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* renamed from: o.wm2$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        @InterfaceC5670cr1
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C10548wm2(@InterfaceC11300zs1 b bVar) {
        k(bVar);
    }

    public final float c(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.a.getFontMetrics().ascent);
    }

    public final float d(@InterfaceC11300zs1 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    @InterfaceC11300zs1
    public C9081qm2 e() {
        return this.g;
    }

    public float f(@InterfaceC11300zs1 String str) {
        if (!this.e) {
            return this.d;
        }
        j(str);
        return this.d;
    }

    @InterfaceC5670cr1
    public TextPaint g() {
        return this.a;
    }

    public float h(String str) {
        if (!this.e) {
            return this.c;
        }
        j(str);
        return this.c;
    }

    public boolean i() {
        return this.e;
    }

    public final void j(String str) {
        this.c = d(str);
        this.d = c(str);
        this.e = false;
    }

    public void k(@InterfaceC11300zs1 b bVar) {
        this.f = new WeakReference<>(bVar);
    }

    public void l(@InterfaceC11300zs1 C9081qm2 c9081qm2, Context context) {
        if (this.g != c9081qm2) {
            this.g = c9081qm2;
            if (c9081qm2 != null) {
                c9081qm2.s(context, this.a, this.b);
                b bVar = this.f.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                c9081qm2.r(context, this.a, this.b);
                this.e = true;
            }
            b bVar2 = this.f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void m(boolean z) {
        this.e = z;
    }

    public void n(boolean z) {
        this.e = z;
    }

    public void o(Context context) {
        this.g.r(context, this.a, this.b);
    }
}
