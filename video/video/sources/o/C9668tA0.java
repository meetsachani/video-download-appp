package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.tA0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9668tA0 implements InterfaceC5999eD {
    public final Set<String> a;

    public C9668tA0(String... strArr) {
        this.a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // o.InterfaceC5999eD
    public boolean a(String str) {
        return this.a.contains(str);
    }
}
