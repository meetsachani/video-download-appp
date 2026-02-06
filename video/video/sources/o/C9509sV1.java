package o;

/* renamed from: o.sV1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9509sV1 implements InterfaceC10484wV1 {
    public static final int b = 0;
    public int a = 0;

    @Override // o.InterfaceC10484wV1
    public boolean a(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            if (c()) {
                this.a = strArr.length;
            }
            if (strArr.length == this.a) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC10484wV1
    public void b(String[] strArr) throws C5817dS {
        if (!a(strArr)) {
            if (!c()) {
                if (strArr != null && strArr.length != 0) {
                    throw new C5817dS(String.format("Row was expected to have %d elements but had %d instead", Integer.valueOf(this.a), Integer.valueOf(strArr.length)));
                }
                throw new C5817dS("Row should not be empty or null");
            }
            throw new C5817dS("First row should not be empty or null");
        }
    }

    public final boolean c() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }
}
