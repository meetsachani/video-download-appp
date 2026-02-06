package o;

import java.beans.IntrospectionException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Rh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4121Rh2 implements InterfaceC10056um {
    public static final C4121Rh2 b = new C4121Rh2(Collections.singleton(com.facebook.applinks.c.f));
    public final Set<String> a;

    public C4121Rh2(Collection<String> collection) {
        if (collection != null) {
            this.a = Collections.unmodifiableSet(new HashSet(collection));
            return;
        }
        throw new IllegalArgumentException("Property names must not be null!");
    }

    @Override // o.InterfaceC10056um
    public void a(InterfaceC7532kT0 interfaceC7532kT0) throws IntrospectionException {
        for (String str : b()) {
            interfaceC7532kT0.i(str);
        }
    }

    public Set<String> b() {
        return this.a;
    }
}
