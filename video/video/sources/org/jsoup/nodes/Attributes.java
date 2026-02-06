package org.jsoup.nodes;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Range;
import org.jsoup.parser.ParseSettings;

/* loaded from: classes4.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {
    public static final char Y0 = '/';
    public static final String Z0 = "data-";
    public static final String a1 = "";
    public static final int b1 = 3;
    public static final int c1 = 2;
    public static final int d1 = -1;
    public static final /* synthetic */ boolean e1 = false;
    public int X = 0;
    public String[] Y = new String[3];
    public Object[] Z = new Object[3];

    /* loaded from: classes4.dex */
    public static class Dataset extends AbstractMap<String, String> {
        public final Attributes X;

        /* loaded from: classes4.dex */
        public class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            public final Iterator<Attribute> X;
            public Attribute Y;

            public DatasetIterator() {
                this.X = Dataset.this.X.iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<String, String> next() {
                return new Attribute(this.Y.getKey().substring(5), this.Y.getValue());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.X.hasNext()) {
                    Attribute next = this.X.next();
                    this.Y = next;
                    if (next.o()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                Dataset.this.X.n0(this.Y.getKey());
            }
        }

        /* loaded from: classes4.dex */
        public class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            public EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                return new DatasetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i = 0;
                while (new DatasetIterator().hasNext()) {
                    i++;
                }
                return i;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: b */
        public String put(String str, String str2) {
            String str3;
            String w = Attributes.w(str);
            if (this.X.L(w)) {
                str3 = this.X.F(w);
            } else {
                str3 = null;
            }
            this.X.h0(w, str2);
            return str3;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new EntrySet();
        }

        public Dataset(Attributes attributes) {
            this.X = attributes;
        }
    }

    public static String b0(String str) {
        return '/' + str;
    }

    public static boolean d0(String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return false;
        }
        return true;
    }

    public static String p(Object obj) {
        if (obj == null) {
            return "";
        }
        return (String) obj;
    }

    public static String w(String str) {
        return Z0 + str;
    }

    public Map<String, String> B() {
        return new Dataset();
    }

    public int D(ParseSettings parseSettings) {
        int i = 0;
        if (this.X == 0) {
            return 0;
        }
        boolean e = parseSettings.e();
        int i2 = 0;
        while (i < this.X) {
            String str = this.Y[i];
            i++;
            int i3 = i;
            while (i3 < this.X) {
                if ((e && str.equals(this.Y[i3])) || (!e && str.equalsIgnoreCase(this.Y[i3]))) {
                    i2++;
                    m0(i3);
                    i3--;
                }
                i3++;
            }
        }
        return i2;
    }

    public String F(String str) {
        int X = X(str);
        if (X == -1) {
            return "";
        }
        return p(this.Z[X]);
    }

    public String G(String str) {
        int Y = Y(str);
        if (Y == -1) {
            return "";
        }
        return p(this.Z[Y]);
    }

    public Map<String, Range.AttributeRange> H() {
        return (Map) t0(SharedConstants.b);
    }

    public boolean J(String str) {
        int X = X(str);
        if (X != -1 && this.Z[X] != null) {
            return true;
        }
        return false;
    }

    public boolean K(String str) {
        int Y = Y(str);
        if (Y != -1 && this.Z[Y] != null) {
            return true;
        }
        return false;
    }

    public boolean L(String str) {
        if (X(str) != -1) {
            return true;
        }
        return false;
    }

    public boolean M(String str) {
        if (Y(str) != -1) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return L(SharedConstants.a);
    }

    public String U() {
        StringBuilder e = StringUtil.e();
        V(QuietAppendable.d(e), new Document.OutputSettings());
        return StringUtil.x(e);
    }

    public final void V(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        String e;
        int i = this.X;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.Y[i2];
            if (!d0(str) && (e = Attribute.e(str, outputSettings.p())) != null) {
                Attribute.m(e, (String) this.Z[i2], quietAppendable.a(' '), outputSettings);
            }
        }
    }

    public int X(String str) {
        Validate.q(str);
        for (int i = 0; i < this.X; i++) {
            if (str.equals(this.Y[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int Y(String str) {
        Validate.q(str);
        for (int i = 0; i < this.X; i++) {
            if (str.equalsIgnoreCase(this.Y[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.X != attributes.X) {
            return false;
        }
        for (int i = 0; i < this.X; i++) {
            int X = attributes.X(this.Y[i]);
            if (X == -1 || !Objects.equals(this.Z[i], attributes.Z[X])) {
                return false;
            }
        }
        return true;
    }

    public Attributes f(String str, String str2) {
        i(str, str2);
        return this;
    }

    public void f0() {
        for (int i = 0; i < this.X; i++) {
            String str = this.Y[i];
            if (!d0(str)) {
                this.Y[i] = Normalizer.a(str);
            }
        }
    }

    public void h(Attributes attributes) {
        boolean z;
        int size = attributes.size();
        if (size != 0) {
            l(this.X + size);
            if (this.X != 0) {
                z = true;
            } else {
                z = false;
            }
            Iterator<Attribute> it = attributes.iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                if (z) {
                    k0(next);
                } else {
                    i(next.getKey(), next.getValue());
                }
            }
        }
    }

    public Attributes h0(String str, String str2) {
        Validate.q(str);
        int X = X(str);
        if (X != -1) {
            this.Z[X] = str2;
            return this;
        }
        i(str, str2);
        return this;
    }

    public int hashCode() {
        return (((this.X * 31) + Arrays.hashCode(this.Y)) * 31) + Arrays.hashCode(this.Z);
    }

    public final void i(String str, Object obj) {
        l(this.X + 1);
        String[] strArr = this.Y;
        int i = this.X;
        strArr[i] = str;
        this.Z[i] = obj;
        this.X = i + 1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
        return new Iterator<Attribute>() { // from class: org.jsoup.nodes.Attributes.1
            public static final /* synthetic */ boolean Y0 = false;
            public int X;
            public int Y = 0;

            {
                this.X = Attributes.this.X;
            }

            public final void b() {
                if (Attributes.this.X == this.X) {
                    return;
                }
                throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
            }

            @Override // java.util.Iterator
            /* renamed from: c */
            public Attribute next() {
                b();
                int i = this.Y;
                Attributes attributes = Attributes.this;
                if (i < attributes.X) {
                    String str = attributes.Y[i];
                    Attributes attributes2 = Attributes.this;
                    Attribute attribute = new Attribute(str, (String) attributes2.Z[this.Y], attributes2);
                    this.Y++;
                    return attribute;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                while (true) {
                    int i = this.Y;
                    Attributes attributes = Attributes.this;
                    if (i >= attributes.X || !Attributes.d0(attributes.Y[i])) {
                        break;
                    }
                    this.Y++;
                }
                if (this.Y < Attributes.this.X) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                Attributes attributes = Attributes.this;
                int i = this.Y - 1;
                this.Y = i;
                attributes.m0(i);
                this.X--;
            }
        };
    }

    public List<Attribute> j() {
        ArrayList arrayList = new ArrayList(this.X);
        for (int i = 0; i < this.X; i++) {
            String str = this.Y[i];
            if (!d0(str)) {
                arrayList.add(new Attribute(str, (String) this.Z[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attributes j0(String str, boolean z) {
        if (z) {
            l0(str, null);
            return this;
        }
        n0(str);
        return this;
    }

    public Attribute k(String str) {
        int X = X(str);
        if (X == -1) {
            return null;
        }
        return new Attribute(str, p(this.Z[X]), this);
    }

    public Attributes k0(Attribute attribute) {
        Validate.q(attribute);
        h0(attribute.getKey(), attribute.getValue());
        attribute.Z = this;
        return this;
    }

    public final void l(int i) {
        boolean z;
        if (i >= this.X) {
            z = true;
        } else {
            z = false;
        }
        Validate.j(z);
        String[] strArr = this.Y;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = 3;
        if (length >= 3) {
            i2 = this.X * 2;
        }
        if (i <= i2) {
            i = i2;
        }
        this.Y = (String[]) Arrays.copyOf(strArr, i);
        this.Z = Arrays.copyOf(this.Z, i);
    }

    public void l0(String str, String str2) {
        int Y = Y(str);
        if (Y != -1) {
            this.Z[Y] = str2;
            if (!this.Y[Y].equals(str)) {
                this.Y[Y] = str;
                return;
            }
            return;
        }
        i(str, str2);
    }

    public final void m0(int i) {
        boolean z;
        if (i >= this.X) {
            z = true;
        } else {
            z = false;
        }
        Validate.h(z);
        int i2 = (this.X - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.Y;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.Z;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.X - 1;
        this.X = i4;
        this.Y[i4] = null;
        this.Z[i4] = null;
    }

    public void n0(String str) {
        int X = X(str);
        if (X != -1) {
            m0(X);
        }
    }

    public void p0(String str) {
        int Y = Y(str);
        if (Y != -1) {
            m0(Y);
        }
    }

    /* renamed from: r */
    public Attributes clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.X = this.X;
            attributes.Y = (String[]) Arrays.copyOf(this.Y, this.X);
            attributes.Z = Arrays.copyOf(this.Z, this.X);
            int X = X(SharedConstants.a);
            if (X != -1) {
                this.Z[X] = new HashMap((Map) this.Z[X]);
            }
            return attributes;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Attributes r0(String str, Range.AttributeRange attributeRange) {
        Validate.q(str);
        Validate.q(attributeRange);
        Map<String, Range.AttributeRange> H = H();
        if (H == null) {
            H = new HashMap<>();
            v0(SharedConstants.b, H);
        }
        H.put(str, attributeRange);
        return this;
    }

    public Range.AttributeRange s0(String str) {
        if (!L(str)) {
            return Range.AttributeRange.c;
        }
        Map<String, Range.AttributeRange> H = H();
        if (H == null) {
            return Range.AttributeRange.c;
        }
        Range.AttributeRange attributeRange = H.get(str);
        if (attributeRange != null) {
            return attributeRange;
        }
        return Range.AttributeRange.c;
    }

    public int size() {
        if (this.X == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.X; i2++) {
            if (!d0(this.Y[i2])) {
                i++;
            }
        }
        return i;
    }

    public Object t0(String str) {
        Validate.q(str);
        if (!Q()) {
            return null;
        }
        return u0().get(str);
    }

    public String toString() {
        return U();
    }

    public Map<String, Object> u0() {
        int X = X(SharedConstants.a);
        if (X == -1) {
            HashMap hashMap = new HashMap();
            i(SharedConstants.a, hashMap);
            return hashMap;
        }
        return (Map) this.Z[X];
    }

    public Attributes v0(String str, Object obj) {
        Validate.q(str);
        if (obj == null && !L(SharedConstants.a)) {
            return this;
        }
        Map<String, Object> u0 = u0();
        if (obj == null) {
            u0.remove(str);
            return this;
        }
        u0.put(str, obj);
        return this;
    }
}
