package o;

@L40("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@InterfaceC10420wF0
@InterfaceC6584ga0
/* renamed from: o.we0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10514we0 {
    public final YA0<String, String> a = new YA0() { // from class: o.ve0
        @Override // o.YA0
        public final Object apply(Object obj) {
            return AbstractC10514we0.this.b((String) obj);
        }
    };

    public final YA0<String, String> a() {
        return this.a;
    }

    public abstract String b(String str);
}
