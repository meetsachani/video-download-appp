package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o.C8941qC0;

/* renamed from: o.qC0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8941qC0<T> extends SG0<T> {

    /* renamed from: o.qC0$a */
    /* loaded from: classes3.dex */
    public static class a implements Comparable<a> {
        public final Integer X;
        public final String Y;
        public final Field Y0;
        public final Class<?> Z;

        public a(Integer num, String str, Class<?> cls, Field field) {
            this.X = num;
            this.Y = str;
            this.Z = cls;
            this.Y0 = field;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(a aVar) {
            return Integer.compare(this.X.intValue(), aVar.X.intValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.X, ((a) obj).X);
        }

        public int hashCode() {
            return Objects.hash(this.X);
        }
    }

    public C8941qC0() {
    }

    public static /* synthetic */ boolean Y(C8941qC0 c8941qC0, String str) {
        if (c8941qC0.h.h(str.toUpperCase()) == null) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean Z(a aVar, a aVar2) {
        if (!C4500Ve2.T(aVar2.Y, aVar.Y) && !Objects.equals(aVar2.Y0, aVar.Y0)) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC5289bH0, o.InterfaceC7449k81
    public void c(C3968Ps c3968Ps) throws IOException, XR {
        super.c(c3968Ps);
        final InterfaceC7664l11<Class<?>, Field> interfaceC7664l11 = J().get(Boolean.FALSE);
        final C10495wZ0 c = C10495wZ0.c();
        final LinkedList linkedList = new LinkedList();
        ((Set) Stream.of((Object[]) this.b.e()).filter(new Predicate() { // from class: o.mC0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((String) obj);
            }
        }).filter(new Predicate() { // from class: o.nC0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C8941qC0.Y(C8941qC0.this, (String) obj);
            }
        }).collect(Collectors.toSet())).forEach(new Consumer() { // from class: o.oC0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                InterfaceC7664l11.this.r().forEach(new Consumer() { // from class: o.lC0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        r1.add(new C8941qC0.a(r2.a(r2.toUpperCase(), ((Field) r4.getValue()).getName().toUpperCase()), r3, (Class) r4.getKey(), (Field) ((Map.Entry) obj2).getValue()));
                    }
                });
            }
        });
        linkedList.sort(null);
        while (!linkedList.isEmpty()) {
            final a aVar = (a) linkedList.get(0);
            Field field = aVar.Y0;
            this.h.j(aVar.Y.toUpperCase(), new C9327rm(aVar.Z, aVar.Y0, false, this.e, s(field, field.getType(), null, null, null), null, null));
            linkedList.removeIf(new Predicate() { // from class: o.pC0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C8941qC0.Z(C8941qC0.a.this, (C8941qC0.a) obj);
                }
            });
        }
    }

    public C8941qC0(boolean z) {
        super(z);
    }

    @Override // o.AbstractC5289bH0, o.AbstractC5470c2
    public void I(InterfaceC7664l11<Class<?>, Field> interfaceC7664l11) {
    }
}
