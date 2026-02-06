package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.AbstractC3033Ge0;
import o.HT1;
import o.ID;
import o.InterfaceC8826pj2;
import o.N31;

@InterfaceC11123z82
@InterfaceC10697xN2
/* renamed from: o.iX1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7062iX1 implements InterfaceC4207Se0, InterfaceC8826pj2, GD {
    public static final String a1 = "SQLiteEventStore";
    public static final int b1 = 16;
    public static final int c1 = 50;
    public static final C3123Hc0 d1 = C3123Hc0.b("proto");
    public final C10736xY1 X;
    public final ND Y;
    public final AbstractC4304Te0 Y0;
    public final ND Z;
    public final InterfaceC6272fK1<String> Z0;

    /* renamed from: o.iX1$b */
    /* loaded from: classes2.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* renamed from: o.iX1$c */
    /* loaded from: classes2.dex */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: o.iX1$d */
    /* loaded from: classes2.dex */
    public interface d<T> {
        T a();
    }

    @RP0
    public C7062iX1(@InterfaceC10438wJ2 ND nd, @InterfaceC3058Gk1 ND nd2, AbstractC4304Te0 abstractC4304Te0, C10736xY1 c10736xY1, @InterfaceC10309vo1("PACKAGE_NAME") InterfaceC6272fK1<String> interfaceC6272fK1) {
        this.X = c10736xY1;
        this.Y = nd;
        this.Z = nd2;
        this.Y0 = abstractC4304Te0;
        this.Z0 = interfaceC6272fK1;
    }

    public static /* synthetic */ Object A(Throwable th) {
        throw new C8583oj2("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object C(String str, N31.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) p0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.k())}), new b() { // from class: o.JW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.u((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(SQ0.n, Integer.valueOf(bVar.k()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.k())});
        return null;
    }

    public static /* synthetic */ Object E(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public static /* synthetic */ Integer F(final C7062iX1 c7062iX1, long j, SQLiteDatabase sQLiteDatabase) {
        c7062iX1.getClass();
        String[] strArr = {String.valueOf(j)};
        p0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: o.ZW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.n(C7062iX1.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object G(C7062iX1 c7062iX1, List list, Nt2 nt2, Cursor cursor) {
        c7062iX1.getClass();
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            AbstractC3033Ge0.a k = AbstractC3033Ge0.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                k.h(new C10988yb0(m0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.h(new C10988yb0(m0(cursor.getString(4)), c7062iX1.k0(j)));
            }
            if (!cursor.isNull(6)) {
                k.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(MC1.a(j, nt2, k.d()));
        }
        return null;
    }

    public static /* synthetic */ Object H(C7062iX1 c7062iX1, SQLiteDatabase sQLiteDatabase) {
        c7062iX1.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c7062iX1.Y.a()).execute();
        return null;
    }

    public static /* synthetic */ ID I(final C7062iX1 c7062iX1, String str, final Map map, final ID.a aVar, SQLiteDatabase sQLiteDatabase) {
        c7062iX1.getClass();
        return (ID) p0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: o.MW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.t(C7062iX1.this, map, aVar, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long M(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ C5421bp2 N(final long j, SQLiteDatabase sQLiteDatabase) {
        return (C5421bp2) p0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: o.YW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.i(j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ C5421bp2 i(long j, Cursor cursor) {
        cursor.moveToNext();
        return C5421bp2.d().c(cursor.getLong(0)).b(j).a();
    }

    public static byte[] i0(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ List j(C7062iX1 c7062iX1, Nt2 nt2, SQLiteDatabase sQLiteDatabase) {
        EnumC10429wH1[] values;
        List<MC1> e0 = c7062iX1.e0(sQLiteDatabase, nt2, c7062iX1.Y0.d());
        for (EnumC10429wH1 enumC10429wH1 : EnumC10429wH1.values()) {
            if (enumC10429wH1 != nt2.d()) {
                int d2 = c7062iX1.Y0.d() - e0.size();
                if (d2 <= 0) {
                    break;
                }
                e0.addAll(c7062iX1.e0(sQLiteDatabase, nt2.f(enumC10429wH1), d2));
            }
        }
        return c7062iX1.c0(e0, c7062iX1.g0(sQLiteDatabase, e0));
    }

    public static /* synthetic */ List k(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(Nt2.a().b(cursor.getString(1)).d(DH1.b(cursor.getInt(2))).c(i0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object l(C7062iX1 c7062iX1, Cursor cursor) {
        c7062iX1.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            c7062iX1.f(i, N31.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase m(Throwable th) {
        throw new C8583oj2("Timed out while trying to open db.", th);
    }

    public static C3123Hc0 m0(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return d1;
        }
        return C3123Hc0.b(str);
    }

    public static /* synthetic */ Object n(C7062iX1 c7062iX1, Cursor cursor) {
        c7062iX1.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            c7062iX1.f(i, N31.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static String n0(Iterable<MC1> iterable) {
        StringBuilder sb = new StringBuilder(C9811tl1.c);
        Iterator<MC1> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ Object o(final C7062iX1 c7062iX1, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        c7062iX1.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        p0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: o.hX1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.l(C7062iX1.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean p(C7062iX1 c7062iX1, Nt2 nt2, SQLiteDatabase sQLiteDatabase) {
        Long Z = c7062iX1.Z(sQLiteDatabase, nt2);
        if (Z == null) {
            return Boolean.FALSE;
        }
        return (Boolean) p0(c7062iX1.T().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{Z.toString()}), new b() { // from class: o.cX1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @InterfaceC5056aJ2
    public static <T> T p0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object q(long j, Nt2 nt2, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{nt2.b(), String.valueOf(DH1.a(nt2.d()))}) < 1) {
            contentValues.put("backend_name", nt2.b());
            contentValues.put("priority", Integer.valueOf(DH1.a(nt2.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] r(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List s(SQLiteDatabase sQLiteDatabase) {
        return (List) p0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: o.TW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.k((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ ID t(C7062iX1 c7062iX1, Map map, ID.a aVar, Cursor cursor) {
        c7062iX1.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            N31.b P = c7062iX1.P(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(N31.d().c(P).b(j).a());
        }
        c7062iX1.j0(aVar, map);
        aVar.f(c7062iX1.W());
        aVar.d(c7062iX1.U());
        aVar.c(c7062iX1.Z0.get());
        return aVar.b();
    }

    public static /* synthetic */ Boolean u(Cursor cursor) {
        boolean z;
        if (cursor.getCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ Object v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    public static /* synthetic */ Long x(C7062iX1 c7062iX1, AbstractC3033Ge0 abstractC3033Ge0, Nt2 nt2, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (c7062iX1.b0()) {
            c7062iX1.f(1L, N31.b.CACHE_FULL, abstractC3033Ge0.l());
            return -1L;
        }
        long R = c7062iX1.R(sQLiteDatabase, nt2);
        int e = c7062iX1.Y0.e();
        byte[] a2 = abstractC3033Ge0.e().a();
        if (a2.length <= e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C9998uW1.Y, Long.valueOf(R));
        contentValues.put("transport_name", abstractC3033Ge0.l());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC3033Ge0.f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC3033Ge0.m()));
        contentValues.put("payload_encoding", abstractC3033Ge0.e().b().a());
        contentValues.put("code", abstractC3033Ge0.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = a2;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC3033Ge0.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ Object y(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long z(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    @Override // o.InterfaceC4207Se0
    public int J() {
        final long a2 = this.Y.a() - this.Y0.c();
        return ((Integer) a0(new b() { // from class: o.QW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.F(C7062iX1.this, a2, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // o.InterfaceC4207Se0
    public void L2(Iterable<MC1> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + n0(iterable);
        a0(new b() { // from class: o.RW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.o(C7062iX1.this, str, r3, (SQLiteDatabase) obj);
            }
        });
    }

    @HT1({HT1.a.Z0})
    public void O() {
        a0(new b() { // from class: o.dX1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.v((SQLiteDatabase) obj);
            }
        });
    }

    public final N31.b P(int i) {
        N31.b bVar = N31.b.REASON_UNKNOWN;
        if (i == bVar.k()) {
            return bVar;
        }
        N31.b bVar2 = N31.b.MESSAGE_TOO_OLD;
        if (i == bVar2.k()) {
            return bVar2;
        }
        N31.b bVar3 = N31.b.CACHE_FULL;
        if (i == bVar3.k()) {
            return bVar3;
        }
        N31.b bVar4 = N31.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.k()) {
            return bVar4;
        }
        N31.b bVar5 = N31.b.MAX_RETRIES_REACHED;
        if (i == bVar5.k()) {
            return bVar5;
        }
        N31.b bVar6 = N31.b.INVALID_PAYLOD;
        if (i == bVar6.k()) {
            return bVar6;
        }
        N31.b bVar7 = N31.b.SERVER_ERROR;
        if (i == bVar7.k()) {
            return bVar7;
        }
        C7676l41.c(a1, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    public final void Q(final SQLiteDatabase sQLiteDatabase) {
        l0(new d() { // from class: o.aX1
            @Override // o.C7062iX1.d
            public final Object a() {
                return C7062iX1.y(sQLiteDatabase);
            }
        }, new b() { // from class: o.bX1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.A((Throwable) obj);
            }
        });
    }

    public final long R(SQLiteDatabase sQLiteDatabase, Nt2 nt2) {
        Long Z = Z(sQLiteDatabase, nt2);
        if (Z != null) {
            return Z.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", nt2.b());
        contentValues.put("priority", Integer.valueOf(DH1.a(nt2.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (nt2.c() != null) {
            contentValues.put("extras", Base64.encodeToString(nt2.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // o.InterfaceC4207Se0
    @InterfaceC11300zs1
    public MC1 R2(final Nt2 nt2, final AbstractC3033Ge0 abstractC3033Ge0) {
        C7676l41.e(a1, "Storing event with priority=%s, name=%s for destination %s", nt2.d(), abstractC3033Ge0.l(), nt2.b());
        long longValue = ((Long) a0(new b() { // from class: o.KW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.x(C7062iX1.this, abstractC3033Ge0, nt2, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return MC1.a(longValue, nt2, abstractC3033Ge0);
    }

    @InterfaceC5056aJ2
    public long S() {
        return V() * n1();
    }

    @InterfaceC5056aJ2
    public SQLiteDatabase T() {
        final C10736xY1 c10736xY1 = this.X;
        Objects.requireNonNull(c10736xY1);
        return (SQLiteDatabase) l0(new d() { // from class: o.fX1
            @Override // o.C7062iX1.d
            public final Object a() {
                return C10736xY1.this.getWritableDatabase();
            }
        }, new b() { // from class: o.gX1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.m((Throwable) obj);
            }
        });
    }

    public final C6004eE0 U() {
        return C6004eE0.d().b(C6343fd2.d().b(S()).c(AbstractC4304Te0.f.f()).a()).a();
    }

    public final long V() {
        return T().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final C5421bp2 W() {
        final long a2 = this.Y.a();
        return (C5421bp2) a0(new b() { // from class: o.WW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.N(a2, (SQLiteDatabase) obj);
            }
        });
    }

    @InterfaceC11300zs1
    public final Long Z(SQLiteDatabase sQLiteDatabase, Nt2 nt2) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(nt2.b(), String.valueOf(DH1.a(nt2.d()))));
        if (nt2.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(nt2.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) p0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: o.IW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.z((Cursor) obj);
            }
        });
    }

    @Override // o.InterfaceC4207Se0
    public void Z2(final Nt2 nt2, final long j) {
        a0(new b() { // from class: o.NW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.q(j, nt2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // o.InterfaceC8826pj2
    public <T> T a(InterfaceC8826pj2.a<T> aVar) {
        SQLiteDatabase T = T();
        Q(T);
        try {
            T execute = aVar.execute();
            T.setTransactionSuccessful();
            return execute;
        } finally {
            T.endTransaction();
        }
    }

    @InterfaceC5056aJ2
    public <T> T a0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase T = T();
        T.beginTransaction();
        try {
            T apply = bVar.apply(T);
            T.setTransactionSuccessful();
            return apply;
        } finally {
            T.endTransaction();
        }
    }

    public final boolean b0() {
        if (V() * n1() >= this.Y0.f()) {
            return true;
        }
        return false;
    }

    public final List<MC1> c0(List<MC1> list, Map<Long, Set<c>> map) {
        ListIterator<MC1> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            MC1 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                AbstractC3033Ge0.a n = next.b().n();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    n.c(cVar.a, cVar.b);
                }
                listIterator.set(MC1.a(next.c(), next.d(), n.d()));
            }
        }
        return list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    @Override // o.GD
    public void d() {
        a0(new b() { // from class: o.OW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.H(C7062iX1.this, (SQLiteDatabase) obj);
            }
        });
    }

    public final List<MC1> e0(SQLiteDatabase sQLiteDatabase, final Nt2 nt2, int i) {
        final ArrayList arrayList = new ArrayList();
        Long Z = Z(sQLiteDatabase, nt2);
        if (Z == null) {
            return arrayList;
        }
        p0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{Z.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: o.HW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.G(C7062iX1.this, arrayList, nt2, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // o.GD
    public void f(final long j, final N31.b bVar, final String str) {
        a0(new b() { // from class: o.SW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.C(str, bVar, j, (SQLiteDatabase) obj);
            }
        });
    }

    public final Map<Long, Set<c>> g0(SQLiteDatabase sQLiteDatabase, List<MC1> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        p0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: o.PW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.E(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    @Override // o.InterfaceC4207Se0
    public Iterable<Nt2> g1() {
        return (Iterable) a0(new b() { // from class: o.VW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.s((SQLiteDatabase) obj);
            }
        });
    }

    @Override // o.GD
    public ID h() {
        final ID.a h = ID.h();
        final HashMap hashMap = new HashMap();
        return (ID) a0(new b() { // from class: o.GW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.I(C7062iX1.this, r2, hashMap, h, (SQLiteDatabase) obj);
            }
        });
    }

    public final void j0(ID.a aVar, Map<String, List<N31>> map) {
        for (Map.Entry<String, List<N31>> entry : map.entrySet()) {
            aVar.a(C5723d41.d().d(entry.getKey()).c(entry.getValue()).b());
        }
    }

    public final byte[] k0(long j) {
        return (byte[]) p0(T().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: o.UW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.r((Cursor) obj);
            }
        });
    }

    public final <T> T l0(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.Z.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.Z.a() >= this.Y0.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final long n1() {
        return T().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // o.InterfaceC4207Se0
    public Iterable<MC1> n5(final Nt2 nt2) {
        return (Iterable) a0(new b() { // from class: o.eX1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.j(C7062iX1.this, nt2, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // o.InterfaceC4207Se0
    public boolean p5(final Nt2 nt2) {
        return ((Boolean) a0(new b() { // from class: o.LW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.p(C7062iX1.this, nt2, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // o.InterfaceC4207Se0
    public long x0(Nt2 nt2) {
        return ((Long) p0(T().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{nt2.b(), String.valueOf(DH1.a(nt2.d()))}), new b() { // from class: o.XW1
            @Override // o.C7062iX1.b
            public final Object apply(Object obj) {
                return C7062iX1.M((Cursor) obj);
            }
        })).longValue();
    }

    @Override // o.InterfaceC4207Se0
    public void z0(Iterable<MC1> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        T().compileStatement("DELETE FROM events WHERE _id in " + n0(iterable)).execute();
    }
}
