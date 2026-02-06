package o;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.Jc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3321Jc2 implements Map {
    public static final int Z = 255;
    public f[] X;
    public e[] Y;

    /* renamed from: o.Jc2$a */
    /* loaded from: classes4.dex */
    public class a implements Iterator {
        public ArrayList X;
        public int Y;
        public Map.Entry Z;

        public a() {
            this.X = new ArrayList();
        }

        public Map.Entry b() {
            if (hasNext()) {
                ArrayList arrayList = this.X;
                Map.Entry entry = (Map.Entry) arrayList.remove(arrayList.size() - 1);
                this.Z = entry;
                return entry;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X.size() > 0) {
                return true;
            }
            while (this.Y < C3321Jc2.this.X.length) {
                synchronized (C3321Jc2.this.Y[this.Y]) {
                    try {
                        for (f fVar = C3321Jc2.this.X[this.Y]; fVar != null; fVar = fVar.Z) {
                            this.X.add(fVar);
                        }
                        this.Y++;
                        if (this.X.size() > 0) {
                            return true;
                        }
                    } finally {
                    }
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            return b();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry entry = this.Z;
            if (entry != null) {
                C3321Jc2.this.remove(entry.getKey());
                this.Z = null;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.Jc2$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractSet {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3321Jc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            int f = C3321Jc2.this.f(entry.getKey());
            synchronized (C3321Jc2.this.Y[f]) {
                try {
                    for (f fVar = C3321Jc2.this.X[f]; fVar != null; fVar = fVar.Z) {
                        if (fVar.equals(entry)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int f = C3321Jc2.this.f(entry.getKey());
            synchronized (C3321Jc2.this.Y[f]) {
                try {
                    for (f fVar = C3321Jc2.this.X[f]; fVar != null; fVar = fVar.Z) {
                        if (fVar.equals(entry)) {
                            C3321Jc2.this.remove(fVar.getKey());
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3321Jc2.this.size();
        }
    }

    /* renamed from: o.Jc2$c */
    /* loaded from: classes4.dex */
    public class c extends a {
        public final /* synthetic */ C3321Jc2 Z0;

        public c(C3321Jc2 c3321Jc2) {
            super();
            this.Z0 = c3321Jc2;
        }

        @Override // o.C3321Jc2.a, java.util.Iterator
        public Object next() {
            return b().getKey();
        }
    }

    /* renamed from: o.Jc2$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3321Jc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3321Jc2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int f = C3321Jc2.this.f(obj);
            synchronized (C3321Jc2.this.Y[f]) {
                try {
                    for (f fVar = C3321Jc2.this.X[f]; fVar != null; fVar = fVar.Z) {
                        Object key = fVar.getKey();
                        if (key != obj && (key == null || !key.equals(obj))) {
                        }
                        C3321Jc2.this.remove(key);
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3321Jc2.this.size();
        }
    }

    /* renamed from: o.Jc2$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public int a;

        public e() {
        }
    }

    /* renamed from: o.Jc2$f */
    /* loaded from: classes4.dex */
    public static final class f implements Map.Entry, KX0 {
        public Object X;
        public Object Y;
        public f Z;

        public f() {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.X;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.Y;
                Object value = entry.getValue();
                if (obj3 != null ? obj3.equals(value) : value == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry, o.KX0
        public Object getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            Object obj = this.X;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            Object obj2 = this.Y;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.Y;
            this.Y = obj;
            return obj2;
        }
    }

    /* renamed from: o.Jc2$g */
    /* loaded from: classes4.dex */
    public class g extends a {
        public final /* synthetic */ C3321Jc2 Z0;

        public g(C3321Jc2 c3321Jc2) {
            super();
            this.Z0 = c3321Jc2;
        }

        @Override // o.C3321Jc2.a, java.util.Iterator
        public Object next() {
            return b().getValue();
        }
    }

    /* renamed from: o.Jc2$h */
    /* loaded from: classes4.dex */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3321Jc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3321Jc2.this.size();
        }
    }

    public C3321Jc2() {
        this(255);
    }

    @Override // java.util.Map
    public void clear() {
        for (int i = 0; i < this.X.length; i++) {
            e eVar = this.Y[i];
            synchronized (eVar) {
                this.X[i] = null;
                eVar.a = 0;
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int f2 = f(obj);
        synchronized (this.Y[f2]) {
            try {
                for (f fVar = this.X[f2]; fVar != null; fVar = fVar.Z) {
                    Object obj2 = fVar.X;
                    if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.X.length; i++) {
            synchronized (this.Y[i]) {
                try {
                    for (f fVar = this.X[i]; fVar != null; fVar = fVar.Z) {
                        Object obj2 = fVar.Y;
                        if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                        }
                        return true;
                    }
                } finally {
                }
            }
        }
        return false;
    }

    public void d(Runnable runnable) {
        runnable.getClass();
        e(runnable, 0);
    }

    public final void e(Runnable runnable, int i) {
        if (i >= this.X.length) {
            runnable.run();
            return;
        }
        synchronized (this.Y[i]) {
            e(runnable, i + 1);
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        return new b();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public final int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        int hashCode = obj.hashCode();
        int i = hashCode + (~(hashCode << 15));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (~(i4 << 11));
        int length = (i5 ^ (i5 >>> 16)) % this.X.length;
        if (length < 0) {
            return length * (-1);
        }
        return length;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int f2 = f(obj);
        synchronized (this.Y[f2]) {
            try {
                for (f fVar = this.X[f2]; fVar != null; fVar = fVar.Z) {
                    Object obj2 = fVar.X;
                    if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    }
                    return fVar.Y;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.X.length; i2++) {
            synchronized (this.Y[i2]) {
                try {
                    for (f fVar = this.X[i2]; fVar != null; fVar = fVar.Z) {
                        i += fVar.hashCode();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set keySet() {
        return new d();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        int f2 = f(obj);
        synchronized (this.Y[f2]) {
            try {
                f fVar = this.X[f2];
                if (fVar == null) {
                    f fVar2 = new f();
                    fVar2.X = obj;
                    fVar2.Y = obj2;
                    this.X[f2] = fVar2;
                    this.Y[f2].a++;
                    return null;
                }
                f fVar3 = fVar;
                while (fVar != null) {
                    Object obj3 = fVar.X;
                    if (obj3 != obj && (obj3 == null || !obj3.equals(obj))) {
                        fVar3 = fVar;
                        fVar = fVar.Z;
                    }
                    Object obj4 = fVar.Y;
                    fVar.Y = obj2;
                    return obj4;
                }
                f fVar4 = new f();
                fVar4.X = obj;
                fVar4.Y = obj2;
                fVar3.Z = fVar4;
                this.Y[f2].a++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Object obj : map.keySet()) {
            put(obj, map.get(obj));
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int f2 = f(obj);
        synchronized (this.Y[f2]) {
            try {
                f fVar = null;
                for (f fVar2 = this.X[f2]; fVar2 != null; fVar2 = fVar2.Z) {
                    Object obj2 = fVar2.X;
                    if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                        fVar = fVar2;
                    }
                    if (fVar == null) {
                        this.X[f2] = fVar2.Z;
                    } else {
                        fVar.Z = fVar2.Z;
                    }
                    e eVar = this.Y[f2];
                    eVar.a--;
                    return fVar2.Y;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map
    public int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.X.length; i2++) {
            synchronized (this.Y[i2]) {
                i += this.Y[i2].a;
            }
        }
        return i;
    }

    @Override // java.util.Map
    public Collection values() {
        return new h();
    }

    public C3321Jc2(int i) {
        int max = Math.max(17, i);
        max = max % 2 == 0 ? max - 1 : max;
        this.X = new f[max];
        this.Y = new e[max];
        for (int i2 = 0; i2 < max; i2++) {
            this.Y[i2] = new e();
        }
    }
}
