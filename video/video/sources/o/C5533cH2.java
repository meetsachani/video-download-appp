package o;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import o.C8237nI2;

/* renamed from: o.cH2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5533cH2<R> implements InterfaceC9109qt2<R> {
    public final C8237nI2.a a;
    public InterfaceC8136mt2<R> b;

    /* renamed from: o.cH2$a */
    /* loaded from: classes.dex */
    public static class a implements C8237nI2.a {
        public final Animation a;

        public a(Animation animation) {
            this.a = animation;
        }

        @Override // o.C8237nI2.a
        public Animation a(Context context) {
            return this.a;
        }
    }

    /* renamed from: o.cH2$b */
    /* loaded from: classes.dex */
    public static class b implements C8237nI2.a {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // o.C8237nI2.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.a);
        }
    }

    public C5533cH2(Animation animation) {
        this(new a(animation));
    }

    @Override // o.InterfaceC9109qt2
    public InterfaceC8136mt2<R> a(GU gu, boolean z) {
        if (gu != GU.MEMORY_CACHE && z) {
            if (this.b == null) {
                this.b = new C8237nI2(this.a);
            }
            return this.b;
        }
        return C3767Nq1.b();
    }

    public C5533cH2(int i) {
        this(new b(i));
    }

    public C5533cH2(C8237nI2.a aVar) {
        this.a = aVar;
    }
}
