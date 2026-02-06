package o;

import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;

/* renamed from: o.yB */
/* loaded from: classes4.dex */
public class C10889yB extends AbstractC7172j0 {
    public C10889yB(Reader reader, Integer... numArr) {
        this(reader, new HashSet(Arrays.asList(numArr)));
    }

    public static /* synthetic */ boolean f(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public static IntPredicate h(Set<Integer> set) {
        if (set == null) {
            return AbstractC7172j0.Y;
        }
        final Set unmodifiableSet = Collections.unmodifiableSet(set);
        return new IntPredicate() { // from class: o.xB
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return C10889yB.f(unmodifiableSet, i);
            }
        };
    }

    public C10889yB(Reader reader, Set<Integer> set) {
        super(reader, h(set));
    }
}
