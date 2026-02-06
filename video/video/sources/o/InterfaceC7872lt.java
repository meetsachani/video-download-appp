package o;

@Deprecated
/* renamed from: o.lt */
/* loaded from: classes2.dex */
public interface InterfaceC7872lt {
    public static final InterfaceC7872lt a = new InterfaceC7872lt() { // from class: o.kt
        @Override // o.InterfaceC7872lt
        public final String a(OU ou) {
            return InterfaceC7872lt.b(ou);
        }
    };

    static /* synthetic */ String b(OU ou) {
        String str = ou.i;
        if (str != null) {
            return str;
        }
        return ou.a.toString();
    }

    String a(OU ou);
}
