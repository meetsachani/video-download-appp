package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: o.pw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8878pw2 {
    public static /* synthetic */ List a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
