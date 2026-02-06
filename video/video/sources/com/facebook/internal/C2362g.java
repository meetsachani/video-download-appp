package com.facebook.internal;

import com.facebook.C2416z;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.facebook.internal.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2362g {

    /* renamed from: com.facebook.internal.g$a */
    /* loaded from: classes2.dex */
    public class a implements f {
        public final /* synthetic */ W a;
        public final /* synthetic */ W b;
        public final /* synthetic */ f c;

        public a(final W val$didReturnError, final W val$pendingJobCount, final f val$onMapperCompleteListener) {
            this.a = val$didReturnError;
            this.b = val$pendingJobCount;
            this.c = val$onMapperCompleteListener;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Integer] */
        @Override // com.facebook.internal.C2362g.f
        public void a() {
            if (!((Boolean) this.a.a).booleanValue()) {
                W w = this.b;
                int intValue = ((Integer) w.a).intValue() - 1;
                w.a = Integer.valueOf(intValue);
                if (intValue == 0) {
                    this.c.a();
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
        @Override // com.facebook.internal.C2362g.d
        public void b(C2416z exception) {
            if (((Boolean) this.a.a).booleanValue()) {
                return;
            }
            this.a.a = Boolean.TRUE;
            this.c.b(exception);
        }
    }

    /* renamed from: com.facebook.internal.g$b */
    /* loaded from: classes2.dex */
    public class b implements e {
        public final /* synthetic */ c a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ f c;

        public b(final c val$collection, final Object val$key, final f val$jobCompleteListener) {
            this.a = val$collection;
            this.b = val$key;
            this.c = val$jobCompleteListener;
        }

        @Override // com.facebook.internal.C2362g.d
        public void b(C2416z exception) {
            this.c.b(exception);
        }

        @Override // com.facebook.internal.C2362g.e
        public void c(Object mappedValue) {
            this.a.b(this.b, mappedValue, this.c);
            this.c.a();
        }
    }

    /* renamed from: com.facebook.internal.g$c */
    /* loaded from: classes2.dex */
    public interface c<T> {
        Iterator<T> a();

        void b(T key, Object value, d onErrorListener);

        Object get(T key);
    }

    /* renamed from: com.facebook.internal.g$d */
    /* loaded from: classes2.dex */
    public interface d {
        void b(C2416z exception);
    }

    /* renamed from: com.facebook.internal.g$e */
    /* loaded from: classes2.dex */
    public interface e extends d {
        void c(Object mappedValue);
    }

    /* renamed from: com.facebook.internal.g$f */
    /* loaded from: classes2.dex */
    public interface f extends d {
        void a();
    }

    /* renamed from: com.facebook.internal.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0084g {
        void a(Object value, e onMapValueCompleteListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(final c<T> collection, final InterfaceC0084g valueMapper, final f onMapperCompleteListener) {
        W w = new W(Boolean.FALSE);
        W w2 = new W(1);
        a aVar = new a(w, w2, onMapperCompleteListener);
        Iterator a2 = collection.a();
        LinkedList linkedList = new LinkedList();
        while (a2.hasNext()) {
            linkedList.add(a2.next());
        }
        for (Object obj : linkedList) {
            Object obj2 = collection.get(obj);
            b bVar = new b(collection, obj, aVar);
            T t = w2.a;
            Integer num = (Integer) t;
            w2.a = (T) Integer.valueOf(((Integer) t).intValue() + 1);
            valueMapper.a(obj2, bVar);
        }
        aVar.a();
    }
}
