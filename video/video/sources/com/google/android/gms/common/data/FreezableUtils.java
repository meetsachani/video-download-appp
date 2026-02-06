package com.google.android.gms.common.data;

import java.util.ArrayList;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class FreezableUtils {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5670cr1
    public static <T, E extends Freezable<T>> ArrayList<T> a(@InterfaceC5670cr1 ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(arrayList.get(i).freeze());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5670cr1
    public static <T, E extends Freezable<T>> ArrayList<T> b(@InterfaceC5670cr1 E[] eArr) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            arrayList.add(e.freeze());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5670cr1
    public static <T, E extends Freezable<T>> ArrayList<T> c(@InterfaceC5670cr1 Iterable<E> iterable) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        for (E e : iterable) {
            arrayList.add(e.freeze());
        }
        return arrayList;
    }
}
