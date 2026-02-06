package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/* renamed from: o.fa2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6331fa2 extends Properties {
    private static final long serialVersionUID = 1;

    @Override // java.util.Hashtable, java.util.Dictionary
    public synchronized Enumeration<Object> keys() {
        ArrayList arrayList;
        try {
            Set<Object> keySet = keySet();
            arrayList = new ArrayList(keySet.size());
            for (Object obj : keySet) {
                arrayList.add(obj.toString());
            }
            Collections.sort(arrayList);
        } catch (Throwable th) {
            throw th;
        }
        return new C5826dU0(arrayList.iterator());
    }
}
