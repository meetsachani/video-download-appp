package o;

import java.io.Serializable;

@InterfaceC9150r20(level = EnumC9879u20.Y, message = "This class is no longer supported, do not use it.")
@Deprecated
/* renamed from: o.jB0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7217jB0 implements InterfaceC5022aB0, Serializable, FA0, HA0, VA0, XA0, ZA0, InterfaceC5265bB0, InterfaceC5507cB0, InterfaceC5750dB0, InterfaceC5992eB0, InterfaceC6235fB0, GA0, IA0, JA0, KA0, LA0, MA0, NA0, OA0, PA0, QA0, SA0, TA0, UA0 {
    @Override // o.InterfaceC5507cB0
    public Object B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        c(6);
        return d(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // o.LA0
    public Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        c(14);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // o.OA0
    public Object D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        c(17);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // o.InterfaceC5750dB0
    public Object G(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        c(7);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // o.MA0
    public Object J(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        c(15);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // o.PA0
    public Object M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        c(18);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // o.XA0
    public Object P(Object obj, Object obj2, Object obj3) {
        c(3);
        return d(obj, obj2, obj3);
    }

    @Override // o.JA0
    public Object Q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        c(12);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // o.QA0
    public Object S(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        c(19);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // o.NA0
    public Object T(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        c(16);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // o.InterfaceC6235fB0
    public Object a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        c(9);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public final void c(int i) {
        if (getArity() != i) {
            f(i);
        }
    }

    @Override // o.InterfaceC5265bB0
    public Object c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c(5);
        return d(obj, obj2, obj3, obj4, obj5);
    }

    public Object d(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    @Override // o.TA0
    public Object d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        c(21);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // o.GA0
    public Object e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        c(10);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public final void f(int i) {
        throw new IllegalStateException("Wrong function arity, expected: " + i + ", actual: " + getArity());
    }

    public abstract int getArity();

    @Override // o.VA0
    public Object i(Object obj, Object obj2) {
        c(2);
        return d(obj, obj2);
    }

    @Override // o.FA0
    public Object invoke() {
        c(0);
        return d(new Object[0]);
    }

    @Override // o.IA0
    public Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        c(11);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // o.ZA0
    public Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        c(4);
        return d(obj, obj2, obj3, obj4);
    }

    @Override // o.InterfaceC5992eB0
    public Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        c(8);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // o.SA0
    public Object v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        c(20);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // o.UA0
    public Object x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        c(22);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // o.KA0
    public Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        c(13);
        return d(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // o.HA0
    public Object invoke(Object obj) {
        c(1);
        return d(obj);
    }
}
