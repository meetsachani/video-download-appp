package o;

import android.graphics.Typeface;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ly  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7892ly extends AbstractC9573sm2 {
    public final Typeface a;
    public final a b;
    public boolean c;

    /* renamed from: o.ly$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public C7892ly(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // o.AbstractC9573sm2
    public void a(int i) {
        d(this.a);
    }

    @Override // o.AbstractC9573sm2
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }
}
