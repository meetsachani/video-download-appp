package o;

import o.AbstractC10819xt2;
import o.C6022eI2;

/* renamed from: o.xt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10819xt2<CHILD extends AbstractC10819xt2<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public InterfaceC9109qt2<? super TranscodeType> X = C3767Nq1.c();

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final CHILD c() {
        return g(C3767Nq1.c());
    }

    public final InterfaceC9109qt2<? super TranscodeType> d() {
        return this.X;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC10819xt2) {
            return SD2.e(this.X, ((AbstractC10819xt2) obj).X);
        }
        return false;
    }

    public final CHILD f(int i) {
        return g(new C5533cH2(i));
    }

    public final CHILD g(InterfaceC9109qt2<? super TranscodeType> interfaceC9109qt2) {
        this.X = (InterfaceC9109qt2) C10175vF1.e(interfaceC9109qt2);
        return e();
    }

    public final CHILD h(C6022eI2.a aVar) {
        return g(new XH2(aVar));
    }

    public int hashCode() {
        InterfaceC9109qt2<? super TranscodeType> interfaceC9109qt2 = this.X;
        if (interfaceC9109qt2 != null) {
            return interfaceC9109qt2.hashCode();
        }
        return 0;
    }

    public final CHILD e() {
        return this;
    }
}
