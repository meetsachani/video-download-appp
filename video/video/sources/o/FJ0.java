package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public class FJ0 extends IOException implements Iterable<Throwable> {
    private static final long serialVersionUID = 1;
    public final List<? extends Throwable> X;

    public FJ0(List<? extends Throwable> list) {
        this(l(list), list);
    }

    public static void d(List<? extends Throwable> list, Object obj) throws FJ0 {
        if (j(list)) {
            return;
        }
        throw new FJ0(Objects.toString(obj, null), list);
    }

    public static boolean j(List<? extends Throwable> list) {
        if (k(list) == 0) {
            return true;
        }
        return false;
    }

    public static int k(List<? extends Throwable> list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static String l(List<? extends Throwable> list) {
        return String.format("%,d exception(s): %s", Integer.valueOf(k(list)), list);
    }

    public <T extends Throwable> T e(int i) {
        return (T) this.X.get(i);
    }

    public <T extends Throwable> T f(int i, Class<T> cls) {
        return cls.cast(e(i));
    }

    public <T extends Throwable> List<T> h() {
        return new ArrayList(this.X);
    }

    public <T extends Throwable> List<T> i(Class<T> cls) {
        return new ArrayList(this.X);
    }

    @Override // java.lang.Iterable
    public Iterator<Throwable> iterator() {
        return h().iterator();
    }

    public FJ0(String str, List<? extends Throwable> list) {
        super(str == null ? l(list) : str, j(list) ? null : list.get(0));
        this.X = list == null ? Collections.EMPTY_LIST : list;
    }
}
