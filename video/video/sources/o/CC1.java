package o;

import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class CC1 {
    @InterfaceC11300zs1
    public final String a;
    public final long b;
    public final List<C8190n7> c;
    public final List<C4896Ze0> d;
    @InterfaceC11300zs1
    public final C11097z20 e;

    public CC1(@InterfaceC11300zs1 String str, long j, List<C8190n7> list) {
        this(str, j, list, Collections.EMPTY_LIST, null);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.c.get(i2).b == i) {
                return i2;
            }
        }
        return -1;
    }

    public CC1(@InterfaceC11300zs1 String str, long j, List<C8190n7> list, List<C4896Ze0> list2) {
        this(str, j, list, list2, null);
    }

    public CC1(@InterfaceC11300zs1 String str, long j, List<C8190n7> list, List<C4896Ze0> list2, @InterfaceC11300zs1 C11097z20 c11097z20) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = c11097z20;
    }
}
