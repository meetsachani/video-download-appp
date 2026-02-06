package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    public HashSet<DataBufferObserver> a = new HashSet<>();

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void a(int i, int i2) {
        Iterator<DataBufferObserver> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void b(int i, int i2) {
        Iterator<DataBufferObserver> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void c(@InterfaceC5670cr1 DataBufferObserver dataBufferObserver) {
        this.a.remove(dataBufferObserver);
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void d(@InterfaceC5670cr1 DataBufferObserver dataBufferObserver) {
        this.a.add(dataBufferObserver);
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void e(int i, int i2, int i3) {
        Iterator<DataBufferObserver> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e(i, i2, i3);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void f(int i, int i2) {
        Iterator<DataBufferObserver> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f(i, i2);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void g() {
        Iterator<DataBufferObserver> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    public void h() {
        this.a.clear();
    }

    public boolean i() {
        if (!this.a.isEmpty()) {
            return true;
        }
        return false;
    }
}
