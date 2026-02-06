package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class JJ2 extends Hashtable {
    public static final int Y0 = 10;
    public static final int Z = 100;
    private static final long serialVersionUID = -1546036869799732453L;
    public final ReferenceQueue X = new ReferenceQueue();
    public int Y = 0;

    /* loaded from: classes4.dex */
    public static final class a implements Map.Entry {
        public final Object X;
        public final Object Y;

        public /* synthetic */ a(Object obj, Object obj2, IJ2 ij2) {
            this(obj, obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                    if (getValue() == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (getValue().equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int i = 0;
            if (getKey() == null) {
                hashCode = 0;
            } else {
                hashCode = getKey().hashCode();
            }
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public a(Object obj, Object obj2) {
            this.X = obj;
            this.Y = obj2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public final WeakReference a;
        public final int b;

        public /* synthetic */ b(Object obj, ReferenceQueue referenceQueue, IJ2 ij2) {
            this(obj, referenceQueue);
        }

        public final Object b() {
            return this.a.get();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Object b = b();
            Object b2 = bVar.b();
            if (b == null) {
                if (b2 != null || hashCode() != bVar.hashCode()) {
                    return false;
                }
                return true;
            }
            return b.equals(b2);
        }

        public int hashCode() {
            return this.b;
        }

        public /* synthetic */ b(Object obj, IJ2 ij2) {
            this(obj);
        }

        public b(Object obj) {
            this.a = new WeakReference(obj);
            this.b = obj.hashCode();
        }

        public b(Object obj, ReferenceQueue referenceQueue) {
            this.a = new c(obj, referenceQueue, this, null);
            this.b = obj.hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends WeakReference {
        public final b a;

        public /* synthetic */ c(Object obj, ReferenceQueue referenceQueue, b bVar, IJ2 ij2) {
            this(obj, referenceQueue, bVar);
        }

        public final b b() {
            return this.a;
        }

        public c(Object obj, ReferenceQueue referenceQueue, b bVar) {
            super(obj, referenceQueue);
            this.a = bVar;
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.X) {
            while (true) {
                try {
                    c cVar = (c) this.X.poll();
                    if (cVar == null) {
                        break;
                    }
                    arrayList.add(cVar.b());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.remove(arrayList.get(i));
        }
    }

    public final void c() {
        synchronized (this.X) {
            try {
                c cVar = (c) this.X.poll();
                if (cVar != null) {
                    super.remove(cVar.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(new b(obj, (IJ2) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        b();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set entrySet() {
        b();
        Set<Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : entrySet) {
            Object b2 = ((b) entry.getKey()).b();
            Object value = entry.getValue();
            if (b2 != null) {
                hashSet.add(new a(b2, value, null));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object get(Object obj) {
        return super.get(new b(obj, (IJ2) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        b();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set keySet() {
        b();
        Set<b> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (b bVar : keySet) {
            Object b2 = bVar.b();
            if (b2 != null) {
                hashSet.add(b2);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        b();
        return new IJ2(this, super.keys());
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        try {
            if (obj != null) {
                if (obj2 != null) {
                    int i = this.Y;
                    int i2 = i + 1;
                    this.Y = i2;
                    if (i > 100) {
                        b();
                        this.Y = 0;
                    } else if (i2 % 10 == 0) {
                        c();
                    }
                } else {
                    throw new NullPointerException("Null values are not allowed");
                }
            } else {
                throw new NullPointerException("Null keys are not allowed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.put(new b(obj, this.X, null), obj2);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable
    public void rehash() {
        b();
        super.rehash();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object remove(Object obj) {
        try {
            int i = this.Y;
            int i2 = i + 1;
            this.Y = i2;
            if (i > 100) {
                b();
                this.Y = 0;
            } else if (i2 % 10 == 0) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.remove(new b(obj, (IJ2) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        b();
        return super.size();
    }

    @Override // java.util.Hashtable
    public String toString() {
        b();
        return super.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection values() {
        b();
        return super.values();
    }
}
