package o;

import java.util.function.Function;

/* renamed from: o.rV1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9266rV1 implements InterfaceC10484wV1 {
    public Function<String[], Boolean> a;
    public String b;

    public C9266rV1(Function<String[], Boolean> function, String str) {
        this.a = function;
        this.b = str;
    }

    @Override // o.InterfaceC10484wV1
    public boolean a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            return this.a.apply(strArr).booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC10484wV1
    public void b(String[] strArr) throws C5817dS {
        if (a(strArr)) {
            return;
        }
        throw new C5817dS(this.b);
    }
}
