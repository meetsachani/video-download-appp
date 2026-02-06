package o;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o.C8501oN2;

/* renamed from: o.qO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8990qO1 implements InterfaceC8747pO1 {
    public final VU1 a;

    /* renamed from: o.qO1$a */
    /* loaded from: classes.dex */
    public class a implements Callable<List<C8501oN2.c>> {
        public final /* synthetic */ InterfaceC11257zh2 a;

        public a(final InterfaceC11257zh2 val$_internalQuery) {
            this.a = val$_internalQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<C8501oN2.c> call() throws Exception {
            ArrayList arrayList;
            ArrayList arrayList2;
            Cursor d = UT.d(C8990qO1.this.a, this.a, true, null);
            try {
                int b = C9982uS.b(d, "id");
                int b2 = C9982uS.b(d, "state");
                int b3 = C9982uS.b(d, "output");
                int b4 = C9982uS.b(d, "run_attempt_count");
                C2531Be c2531Be = new C2531Be();
                C2531Be c2531Be2 = new C2531Be();
                while (d.moveToNext()) {
                    if (!d.isNull(b)) {
                        String string = d.getString(b);
                        if (((ArrayList) c2531Be.get(string)) == null) {
                            c2531Be.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(b)) {
                        String string2 = d.getString(b);
                        if (((ArrayList) c2531Be2.get(string2)) == null) {
                            c2531Be2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                C8990qO1.this.d(c2531Be);
                C8990qO1.this.c(c2531Be2);
                ArrayList arrayList3 = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    if (!d.isNull(b)) {
                        arrayList = (ArrayList) c2531Be.get(d.getString(b));
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!d.isNull(b)) {
                        arrayList2 = (ArrayList) c2531Be2.get(d.getString(b));
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    C8501oN2.c cVar = new C8501oN2.c();
                    if (b != -1) {
                        cVar.a = d.getString(b);
                    }
                    if (b2 != -1) {
                        cVar.b = C10208vN2.g(d.getInt(b2));
                    }
                    if (b3 != -1) {
                        cVar.c = androidx.work.b.m(d.getBlob(b3));
                    }
                    if (b4 != -1) {
                        cVar.d = d.getInt(b4);
                    }
                    cVar.e = arrayList;
                    cVar.f = arrayList2;
                    arrayList3.add(cVar);
                }
                d.close();
                return arrayList3;
            } catch (Throwable th) {
                d.close();
                throw th;
            }
        }
    }

    public C8990qO1(VU1 __db) {
        this.a = __db;
    }

    @Override // o.InterfaceC8747pO1
    public LiveData<List<C8501oN2.c>> a(final InterfaceC11257zh2 query) {
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(query));
    }

    @Override // o.InterfaceC8747pO1
    public List<C8501oN2.c> b(final InterfaceC11257zh2 query) {
        ArrayList<String> arrayList;
        ArrayList<androidx.work.b> arrayList2;
        this.a.b();
        Cursor d = UT.d(this.a, query, true, null);
        try {
            int b = C9982uS.b(d, "id");
            int b2 = C9982uS.b(d, "state");
            int b3 = C9982uS.b(d, "output");
            int b4 = C9982uS.b(d, "run_attempt_count");
            C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>();
            C2531Be<String, ArrayList<androidx.work.b>> c2531Be2 = new C2531Be<>();
            while (d.moveToNext()) {
                if (!d.isNull(b)) {
                    String string = d.getString(b);
                    if (c2531Be.get(string) == null) {
                        c2531Be.put(string, new ArrayList<>());
                    }
                }
                if (!d.isNull(b)) {
                    String string2 = d.getString(b);
                    if (c2531Be2.get(string2) == null) {
                        c2531Be2.put(string2, new ArrayList<>());
                    }
                }
            }
            d.moveToPosition(-1);
            d(c2531Be);
            c(c2531Be2);
            ArrayList arrayList3 = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                if (!d.isNull(b)) {
                    arrayList = c2531Be.get(d.getString(b));
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!d.isNull(b)) {
                    arrayList2 = c2531Be2.get(d.getString(b));
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                C8501oN2.c cVar = new C8501oN2.c();
                if (b != -1) {
                    cVar.a = d.getString(b);
                }
                if (b2 != -1) {
                    cVar.b = C10208vN2.g(d.getInt(b2));
                }
                if (b3 != -1) {
                    cVar.c = androidx.work.b.m(d.getBlob(b3));
                }
                if (b4 != -1) {
                    cVar.d = d.getInt(b4);
                }
                cVar.e = arrayList;
                cVar.f = arrayList2;
                arrayList3.add(cVar);
            }
            d.close();
            return arrayList3;
        } catch (Throwable th) {
            d.close();
            throw th;
        }
    }

    public final void c(final C2531Be<String, ArrayList<androidx.work.b>> _map) {
        ArrayList<androidx.work.b> arrayList;
        Set<String> keySet = _map.keySet();
        if (!keySet.isEmpty()) {
            if (_map.size() > 999) {
                C2531Be<String, ArrayList<androidx.work.b>> c2531Be = new C2531Be<>(999);
                int size = _map.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    c2531Be.put(_map.g(i), _map.l(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        c(c2531Be);
                        c2531Be = new C2531Be<>(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    c(c2531Be);
                    return;
                }
                return;
            }
            StringBuilder c = C4209Se2.c();
            c.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C4209Se2.a(c, size2);
            c.append(C9811tl1.d);
            YU1 h = YU1.h(c.toString(), size2);
            int i3 = 1;
            for (String str : keySet) {
                if (str == null) {
                    h.O4(i3);
                } else {
                    h.r3(i3, str);
                }
                i3++;
            }
            Cursor d = UT.d(this.a, h, false, null);
            try {
                int b = C9982uS.b(d, "work_spec_id");
                if (b == -1) {
                    return;
                }
                while (d.moveToNext()) {
                    if (!d.isNull(b) && (arrayList = _map.get(d.getString(b))) != null) {
                        arrayList.add(androidx.work.b.m(d.getBlob(0)));
                    }
                }
            } finally {
                d.close();
            }
        }
    }

    public final void d(final C2531Be<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        Set<String> keySet = _map.keySet();
        if (!keySet.isEmpty()) {
            if (_map.size() > 999) {
                C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>(999);
                int size = _map.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    c2531Be.put(_map.g(i), _map.l(i));
                    i++;
                    i2++;
                    if (i2 == 999) {
                        d(c2531Be);
                        c2531Be = new C2531Be<>(999);
                        i2 = 0;
                    }
                }
                if (i2 > 0) {
                    d(c2531Be);
                    return;
                }
                return;
            }
            StringBuilder c = C4209Se2.c();
            c.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C4209Se2.a(c, size2);
            c.append(C9811tl1.d);
            YU1 h = YU1.h(c.toString(), size2);
            int i3 = 1;
            for (String str : keySet) {
                if (str == null) {
                    h.O4(i3);
                } else {
                    h.r3(i3, str);
                }
                i3++;
            }
            Cursor d = UT.d(this.a, h, false, null);
            try {
                int b = C9982uS.b(d, "work_spec_id");
                if (b == -1) {
                    return;
                }
                while (d.moveToNext()) {
                    if (!d.isNull(b) && (arrayList = _map.get(d.getString(b))) != null) {
                        arrayList.add(d.getString(0));
                    }
                }
            } finally {
                d.close();
            }
        }
    }
}
