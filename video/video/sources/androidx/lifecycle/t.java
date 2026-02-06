package androidx.lifecycle;

import androidx.lifecycle.u;
import o.AW0;
import o.AbstractC6553gR;
import o.AbstractC8052mY0;
import o.C6074eW0;
import o.C6562gT0;
import o.C9516sY;
import o.CH2;
import o.EY0;
import o.FA0;
import o.GH2;

/* loaded from: classes.dex */
public final class t<VM extends CH2> implements EY0<VM> {
    public final AW0<VM> X;
    public final FA0<GH2> Y;
    public final FA0<AbstractC6553gR> Y0;
    public final FA0<u.b> Z;
    public VM Z0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC8052mY0 implements FA0<AbstractC6553gR.a> {
        public static final a X = new a();

        public a() {
            super(0);
        }

        @Override // o.FA0
        /* renamed from: c */
        public final AbstractC6553gR.a invoke() {
            return AbstractC6553gR.a.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(AW0<VM> aw0, FA0<? extends GH2> fa0, FA0<? extends u.b> fa02) {
        this(aw0, fa0, fa02, null, 8, null);
        C6562gT0.p(aw0, "viewModelClass");
        C6562gT0.p(fa0, "storeProducer");
        C6562gT0.p(fa02, "factoryProducer");
    }

    @Override // o.EY0
    /* renamed from: a */
    public VM getValue() {
        VM vm = this.Z0;
        if (vm == null) {
            VM vm2 = (VM) new u(this.Y.invoke(), this.Z.invoke(), this.Y0.invoke()).a(C6074eW0.e(this.X));
            this.Z0 = vm2;
            return vm2;
        }
        return vm;
    }

    @Override // o.EY0
    public boolean isInitialized() {
        if (this.Z0 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(AW0<VM> aw0, FA0<? extends GH2> fa0, FA0<? extends u.b> fa02, FA0<? extends AbstractC6553gR> fa03) {
        C6562gT0.p(aw0, "viewModelClass");
        C6562gT0.p(fa0, "storeProducer");
        C6562gT0.p(fa02, "factoryProducer");
        C6562gT0.p(fa03, "extrasProducer");
        this.X = aw0;
        this.Y = fa0;
        this.Z = fa02;
        this.Y0 = fa03;
    }

    public /* synthetic */ t(AW0 aw0, FA0 fa0, FA0 fa02, FA0 fa03, int i, C9516sY c9516sY) {
        this(aw0, fa0, fa02, (i & 8) != 0 ? a.X : fa03);
    }
}
