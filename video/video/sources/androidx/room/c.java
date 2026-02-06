package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import o.C10490wX1;
import o.C9987uT0;
import o.InterfaceC10528wh2;
import o.InterfaceC2546Bh2;
import o.UU1;
import o.VU1;
import o.Z72;

/* loaded from: classes.dex */
public class c {
    public static final String[] m = {"UPDATE", "DELETE", "INSERT"};
    public static final String n = "room_table_modification_log";

    /* renamed from: o  reason: collision with root package name */
    public static final String f63o = "table_id";
    public static final String p = "invalidated";
    public static final String q = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    public static final String r = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";
    public static final String s = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    public final HashMap<String, Integer> a;
    public final String[] b;
    public Map<String, Set<String>> c;
    public final VU1 d;
    public AtomicBoolean e;
    public volatile boolean f;
    public volatile InterfaceC2546Bh2 g;
    public b h;
    public final C9987uT0 i;
    public final C10490wX1<AbstractC0048c, d> j;
    public androidx.room.d k;
    public Runnable l;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor w = c.this.d.w(new Z72(c.s));
            while (w.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(w.getInt(0)));
                } catch (Throwable th) {
                    w.close();
                    throw th;
                }
            }
            w.close();
            if (!hashSet.isEmpty()) {
                c.this.g.T0();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Lock k = c.this.d.k();
            Set<Integer> set = null;
            try {
                try {
                    k.lock();
                } catch (SQLiteException e) {
                    e = e;
                    Log.e(UU1.a, "Cannot run invalidation tracker. Is the db closed?", e);
                    k.unlock();
                    if (set != null) {
                    }
                    return;
                } catch (IllegalStateException e2) {
                    e = e2;
                    Log.e(UU1.a, "Cannot run invalidation tracker. Is the db closed?", e);
                    k.unlock();
                    if (set != null) {
                    }
                }
                if (!c.this.f()) {
                    k.unlock();
                } else if (!c.this.e.compareAndSet(true, false)) {
                    k.unlock();
                } else if (c.this.d.q()) {
                    k.unlock();
                } else {
                    VU1 vu1 = c.this.d;
                    if (vu1.g) {
                        InterfaceC10528wh2 writableDatabase = vu1.m().getWritableDatabase();
                        writableDatabase.w0();
                        try {
                            set = a();
                            writableDatabase.s1();
                            writableDatabase.W1();
                        } catch (Throwable th) {
                            writableDatabase.W1();
                            throw th;
                        }
                    } else {
                        set = a();
                    }
                    k.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (c.this.j) {
                            try {
                                Iterator<Map.Entry<AbstractC0048c, d>> it = c.this.j.iterator();
                                while (it.hasNext()) {
                                    it.next().getValue().a(set);
                                }
                            } finally {
                            }
                        }
                    }
                }
            } finally {
                k.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public final long[] a;
        public final boolean[] b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.b = zArr;
            this.c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            boolean z;
            synchronized (this) {
                try {
                    if (this.d && !this.e) {
                        int length = this.a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                if (this.a[i] > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean[] zArr = this.b;
                                if (z != zArr[i]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.c[i] = 0;
                                }
                                zArr[i] = z;
                                i++;
                            } else {
                                this.e = true;
                                this.d = false;
                                return this.c;
                            }
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public void d() {
            synchronized (this) {
                this.e = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final int[] a;
        public final String[] b;
        public final AbstractC0048c c;
        public final Set<String> d;

        public d(AbstractC0048c abstractC0048c, int[] iArr, String[] strArr) {
            this.c = abstractC0048c;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.d = null;
        }

        public void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> set2 = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.a[i]))) {
                    if (length == 1) {
                        set2 = this.d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.b[i]);
                    }
                }
            }
            if (set2 != null) {
                this.c.b(set2);
            }
        }

        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.b.length == 1) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].equalsIgnoreCase(this.b[0])) {
                        set = this.d;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.b;
                    int length2 = strArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            String str2 = strArr2[i2];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i2++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.c.b(set);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends AbstractC0048c {
        public final c b;
        public final WeakReference<AbstractC0048c> c;

        public e(c cVar, AbstractC0048c abstractC0048c) {
            super(abstractC0048c.a);
            this.b = cVar;
            this.c = new WeakReference<>(abstractC0048c);
        }

        @Override // androidx.room.c.AbstractC0048c
        public void b(Set<String> set) {
            AbstractC0048c abstractC0048c = this.c.get();
            if (abstractC0048c == null) {
                this.b.k(this);
            } else {
                abstractC0048c.b(set);
            }
        }
    }

    public c(VU1 vu1, String... strArr) {
        this(vu1, new HashMap(), Collections.EMPTY_MAP, strArr);
    }

    public static void c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append(CrashlyticsReportPersistence.m);
        sb.append(str2);
        sb.append("`");
    }

    public void a(AbstractC0048c abstractC0048c) {
        d j;
        String[] l = l(abstractC0048c.a);
        int[] iArr = new int[l.length];
        int length = l.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.a.get(l[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + l[i]);
            }
        }
        d dVar = new d(abstractC0048c, iArr, l);
        synchronized (this.j) {
            j = this.j.j(abstractC0048c, dVar);
        }
        if (j == null && this.h.b(iArr)) {
            q();
        }
    }

    public void b(AbstractC0048c abstractC0048c) {
        a(new e(this, abstractC0048c));
    }

    @Deprecated
    public <T> LiveData<T> d(String[] strArr, Callable<T> callable) {
        return e(strArr, false, callable);
    }

    public <T> LiveData<T> e(String[] strArr, boolean z, Callable<T> callable) {
        return this.i.a(s(strArr), z, callable);
    }

    public boolean f() {
        if (!this.d.u()) {
            return false;
        }
        if (!this.f) {
            this.d.m().getWritableDatabase();
        }
        if (!this.f) {
            Log.e(UU1.a, "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public void g(InterfaceC10528wh2 interfaceC10528wh2) {
        synchronized (this) {
            try {
                if (this.f) {
                    Log.e(UU1.a, "Invalidation tracker is initialized twice :/.");
                    return;
                }
                interfaceC10528wh2.K0("PRAGMA temp_store = MEMORY;");
                interfaceC10528wh2.K0("PRAGMA recursive_triggers='ON';");
                interfaceC10528wh2.K0(q);
                r(interfaceC10528wh2);
                this.g = interfaceC10528wh2.z3(r);
                this.f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(String... strArr) {
        synchronized (this.j) {
            try {
                Iterator<Map.Entry<AbstractC0048c, d>> it = this.j.iterator();
                while (it.hasNext()) {
                    Map.Entry<AbstractC0048c, d> next = it.next();
                    if (!next.getKey().a()) {
                        next.getValue().b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        if (this.e.compareAndSet(false, true)) {
            this.d.n().execute(this.l);
        }
    }

    public void j() {
        q();
        this.l.run();
    }

    public void k(AbstractC0048c abstractC0048c) {
        d k;
        synchronized (this.j) {
            k = this.j.k(abstractC0048c);
        }
        if (k != null && this.h.c(k.a)) {
            q();
        }
    }

    public final String[] l(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void m(Context context, String str) {
        this.k = new androidx.room.d(context, str, this, this.d.n());
    }

    public final void n(InterfaceC10528wh2 interfaceC10528wh2, int i) {
        String[] strArr;
        interfaceC10528wh2.K0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append(n);
            sb.append(" SET ");
            sb.append(p);
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append(f63o);
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append(p);
            sb.append(" = 0");
            sb.append("; END");
            interfaceC10528wh2.K0(sb.toString());
        }
    }

    public void o() {
        androidx.room.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
            this.k = null;
        }
    }

    public final void p(InterfaceC10528wh2 interfaceC10528wh2, int i) {
        String[] strArr;
        String str = this.b[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            c(sb, str, str2);
            interfaceC10528wh2.K0(sb.toString());
        }
    }

    public void q() {
        if (!this.d.u()) {
            return;
        }
        r(this.d.m().getWritableDatabase());
    }

    public void r(InterfaceC10528wh2 interfaceC10528wh2) {
        if (interfaceC10528wh2.W4()) {
            return;
        }
        while (true) {
            try {
                Lock k = this.d.k();
                k.lock();
                try {
                    int[] a2 = this.h.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    interfaceC10528wh2.w0();
                    for (int i = 0; i < length; i++) {
                        int i2 = a2[i];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                p(interfaceC10528wh2, i);
                            }
                        } else {
                            n(interfaceC10528wh2, i);
                        }
                    }
                    interfaceC10528wh2.s1();
                    interfaceC10528wh2.W1();
                    this.h.d();
                } finally {
                    k.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e(UU1.a, "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }

    public final String[] s(String[] strArr) {
        String[] l = l(strArr);
        for (String str : l) {
            if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return l;
    }

    public c(VU1 vu1, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.e = new AtomicBoolean(false);
        this.f = false;
        this.j = new C10490wX1<>();
        this.l = new a();
        this.d = vu1;
        this.h = new b(strArr.length);
        this.a = new HashMap<>();
        this.c = map2;
        this.i = new C9987uT0(vu1);
        int length = strArr.length;
        this.b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.b[i] = str2.toLowerCase(locale);
            } else {
                this.b[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    /* renamed from: androidx.room.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0048c {
        public final String[] a;

        public AbstractC0048c(String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.a = strArr2;
            strArr2[strArr.length] = str;
        }

        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);

        public AbstractC0048c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }
}
