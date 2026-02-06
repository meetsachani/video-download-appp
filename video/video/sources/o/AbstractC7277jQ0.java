package o;

/* renamed from: o.jQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7277jQ0 {

    /* renamed from: o.jQ0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC7277jQ0 {
        @Override // o.AbstractC7277jQ0
        public AbstractC7036iQ0 a(String className) {
            return null;
        }
    }

    public static AbstractC7277jQ0 c() {
        return new a();
    }

    public abstract AbstractC7036iQ0 a(String className);

    public final AbstractC7036iQ0 b(String className) {
        AbstractC7036iQ0 a2 = a(className);
        if (a2 == null) {
            return AbstractC7036iQ0.a(className);
        }
        return a2;
    }
}
