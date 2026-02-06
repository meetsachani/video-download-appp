package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.gR  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6553gR {
    public final Map<b<?>, Object> a = new LinkedHashMap();

    /* renamed from: o.gR$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC6553gR {
        public static final a b = new a();

        @Override // o.AbstractC6553gR
        public <T> T a(b<T> bVar) {
            C6562gT0.p(bVar, "key");
            return null;
        }
    }

    /* renamed from: o.gR$b */
    /* loaded from: classes.dex */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.a;
    }
}
