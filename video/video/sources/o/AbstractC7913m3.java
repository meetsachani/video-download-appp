package o;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: o.m3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7913m3 extends J1 implements SortedMap {
    public AbstractC7913m3() {
    }

    public SortedMap a() {
        return (SortedMap) this.X;
    }

    public Comparator comparator() {
        return a().comparator();
    }

    public Object firstKey() {
        return a().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return a().headMap(obj);
    }

    public Object lastKey() {
        return a().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return a().subMap(obj, obj2);
    }

    public SortedMap tailMap(Object obj) {
        return a().tailMap(obj);
    }

    public AbstractC7913m3(SortedMap sortedMap) {
        super(sortedMap);
    }
}
