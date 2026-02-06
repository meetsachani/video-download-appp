package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.Eu1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2891Eu1 {
    public boolean b;
    public final List<AbstractC4442Uo1<?>> a = new ArrayList();
    public final CopyOnWriteArrayList<AutoCloseable> c = new CopyOnWriteArrayList<>();

    /* renamed from: o.Eu1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4442Uo1<AbstractC4636Wo1> {
        public final AbstractC2891Eu1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2891Eu1 abstractC2891Eu1, AbstractC4636Wo1 abstractC4636Wo1) {
            super(abstractC4636Wo1, abstractC2891Eu1.g());
            C6562gT0.p(abstractC2891Eu1, "onBackPressedCallback");
            C6562gT0.p(abstractC4636Wo1, com.facebook.S.R);
            this.h = abstractC2891Eu1;
        }

        @Override // o.AbstractC4442Uo1
        public void p() {
            this.h.c();
        }

        @Override // o.AbstractC4442Uo1
        public void q() {
            this.h.d();
        }

        @Override // o.AbstractC4442Uo1
        public void r(C4148Ro1 c4148Ro1) {
            C6562gT0.p(c4148Ro1, "event");
            this.h.e(new C8827pk(c4148Ro1));
        }

        @Override // o.AbstractC4442Uo1
        public void s(C4148Ro1 c4148Ro1) {
            C6562gT0.p(c4148Ro1, "event");
            this.h.f(new C8827pk(c4148Ro1));
        }
    }

    public AbstractC2891Eu1(boolean z) {
        this.b = z;
    }

    public final void a(AutoCloseable autoCloseable) {
        C6562gT0.p(autoCloseable, "closeable");
        this.c.add(autoCloseable);
    }

    public final AbstractC4442Uo1<?> b(AbstractC4636Wo1 abstractC4636Wo1) {
        C6562gT0.p(abstractC4636Wo1, com.facebook.S.R);
        a aVar = new a(this, abstractC4636Wo1);
        this.a.add(aVar);
        return aVar;
    }

    public abstract void d();

    public void e(C8827pk c8827pk) {
        C6562gT0.p(c8827pk, "backEvent");
    }

    public void f(C8827pk c8827pk) {
        C6562gT0.p(c8827pk, "backEvent");
    }

    public final boolean g() {
        return this.b;
    }

    public final void h() {
        Iterator<AutoCloseable> it = this.c.iterator();
        C6562gT0.o(it, "iterator(...)");
        while (it.hasNext()) {
            C2597Bu1.a(it.next());
        }
        this.c.clear();
        for (AbstractC4442Uo1<?> abstractC4442Uo1 : this.a) {
            abstractC4442Uo1.x();
        }
        this.a.clear();
    }

    public final void i(AutoCloseable autoCloseable) {
        C6562gT0.p(autoCloseable, "closeable");
        this.c.remove(autoCloseable);
    }

    public final void j(boolean z) {
        this.b = z;
        for (AbstractC4442Uo1<?> abstractC4442Uo1 : this.a) {
            abstractC4442Uo1.y(z);
        }
    }

    public void c() {
    }
}
