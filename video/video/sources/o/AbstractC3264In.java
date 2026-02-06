package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import o.InterfaceC8136mt2;

/* renamed from: o.In  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3264In<R> implements InterfaceC9109qt2<R> {
    public final InterfaceC9109qt2<Drawable> a;

    /* renamed from: o.In$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC8136mt2<R> {
        public final InterfaceC8136mt2<Drawable> a;

        public a(InterfaceC8136mt2<Drawable> interfaceC8136mt2) {
            this.a = interfaceC8136mt2;
        }

        @Override // o.InterfaceC8136mt2
        public boolean a(R r, InterfaceC8136mt2.a aVar) {
            return this.a.a(new BitmapDrawable(aVar.a().getResources(), AbstractC3264In.this.b(r)), aVar);
        }
    }

    public AbstractC3264In(InterfaceC9109qt2<Drawable> interfaceC9109qt2) {
        this.a = interfaceC9109qt2;
    }

    @Override // o.InterfaceC9109qt2
    public InterfaceC8136mt2<R> a(GU gu, boolean z) {
        return new a(this.a.a(gu, z));
    }

    public abstract Bitmap b(R r);
}
