package o;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o.TM2;

/* renamed from: o.lO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7756lO1 {
    public static void a(StringBuilder builder, int count) {
        if (count > 0) {
            builder.append("?");
            for (int i = 1; i < count; i++) {
                builder.append(",");
                builder.append("?");
            }
        }
    }

    public static InterfaceC11257zh2 b(C7026iN2 querySpec) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<TM2.a> b = querySpec.b();
        String str = " AND";
        String str2 = " WHERE";
        if (!b.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(b.size());
            for (TM2.a aVar : b) {
                arrayList2.add(Integer.valueOf(C10208vN2.j(aVar)));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            a(sb, arrayList2.size());
            sb.append(C9811tl1.d);
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> a = querySpec.a();
        if (!a.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(a.size());
            for (UUID uuid : a) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            a(sb, a.size());
            sb.append(C9811tl1.d);
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> c = querySpec.c();
        if (!c.isEmpty()) {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb, c.size());
            sb.append("))");
            arrayList.addAll(c);
        } else {
            str = str2;
        }
        List<String> d = querySpec.d();
        if (!d.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb, d.size());
            sb.append("))");
            arrayList.addAll(d);
        }
        sb.append(";");
        return new Z72(sb.toString(), arrayList.toArray());
    }
}
