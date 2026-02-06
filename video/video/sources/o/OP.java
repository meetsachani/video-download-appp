package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* loaded from: classes2.dex */
public final class OP<E> implements Iterable<E> {
    public final Object X = new Object();
    @InterfaceC8710pF0("lock")
    public final Map<E, Integer> Y = new HashMap();
    @InterfaceC8710pF0("lock")
    public Set<E> Z = Collections.EMPTY_SET;
    @InterfaceC8710pF0("lock")
    public List<E> Y0 = Collections.EMPTY_LIST;

    public void d(E e) {
        synchronized (this.X) {
            try {
                ArrayList arrayList = new ArrayList(this.Y0);
                arrayList.add(e);
                this.Y0 = Collections.unmodifiableList(arrayList);
                Integer num = this.Y.get(e);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.Z);
                    hashSet.add(e);
                    this.Z = Collections.unmodifiableSet(hashSet);
                }
                Map<E, Integer> map = this.Y;
                int i = 1;
                if (num != null) {
                    i = 1 + num.intValue();
                }
                map.put(e, Integer.valueOf(i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(E e) {
        synchronized (this.X) {
            try {
                Integer num = this.Y.get(e);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.Y0);
                arrayList.remove(e);
                this.Y0 = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.Y.remove(e);
                    HashSet hashSet = new HashSet(this.Z);
                    hashSet.remove(e);
                    this.Z = Collections.unmodifiableSet(hashSet);
                } else {
                    this.Y.put(e, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.X) {
            it = this.Y0.iterator();
        }
        return it;
    }

    public Set<E> n() {
        Set<E> set;
        synchronized (this.X) {
            set = this.Z;
        }
        return set;
    }

    public int w4(E e) {
        int i;
        synchronized (this.X) {
            try {
                if (this.Y.containsKey(e)) {
                    i = this.Y.get(e).intValue();
                } else {
                    i = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
