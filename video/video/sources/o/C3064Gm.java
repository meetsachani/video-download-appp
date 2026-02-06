package o;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.Gm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3064Gm extends AbstractSet {
    public final /* synthetic */ C3162Hm X;

    public C3064Gm(C3162Hm c3162Hm) {
        this.X = c3162Hm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.X.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        HashMap hashMap;
        hashMap = this.X.Y;
        return hashMap.size();
    }
}
