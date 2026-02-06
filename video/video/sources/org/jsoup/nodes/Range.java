package org.jsoup.nodes;

import java.util.Objects;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;

/* loaded from: classes4.dex */
public class Range {
    public static final Position c;
    public static final Range d;
    public final Position a;
    public final Position b;

    /* loaded from: classes4.dex */
    public static class AttributeRange {
        public static final AttributeRange c;
        public final Range a;
        public final Range b;

        static {
            Range range = Range.d;
            c = new AttributeRange(range, range);
        }

        public AttributeRange(Range range, Range range2) {
            this.a = range;
            this.b = range2;
        }

        public Range a() {
            return this.a;
        }

        public Range b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AttributeRange attributeRange = (AttributeRange) obj;
            if (!this.a.equals(attributeRange.a)) {
                return false;
            }
            return this.b.equals(attributeRange.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            StringBuilder e = StringUtil.e();
            e.append(this.a);
            e.append('=');
            e.append(this.b);
            return StringUtil.x(e);
        }
    }

    /* loaded from: classes4.dex */
    public static class Position {
        public final int a;
        public final int b;
        public final int c;

        public Position(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public int b() {
            return this.c;
        }

        public boolean c() {
            if (this != Range.c) {
                return true;
            }
            return false;
        }

        public int d() {
            return this.b;
        }

        public int e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Position position = (Position) obj;
                if (this.a == position.a && this.b == position.b && this.c == position.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public String toString() {
            return this.b + "," + this.c + ":" + this.a;
        }
    }

    static {
        Position position = new Position(-1, -1, -1);
        c = position;
        d = new Range(position, position);
    }

    public Range(Position position, Position position2) {
        this.a = position;
        this.b = position2;
    }

    public static Range f(Node node, boolean z) {
        String str;
        if (z) {
            str = SharedConstants.c;
        } else {
            str = SharedConstants.d;
        }
        if (!node.k0()) {
            return d;
        }
        Object t0 = node.p().t0(str);
        if (t0 != null) {
            return (Range) t0;
        }
        return d;
    }

    public Position b() {
        return this.b;
    }

    public int c() {
        return this.b.a;
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        return this.a.equals(this.b);
    }

    public boolean e() {
        if (this != d) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Range range = (Range) obj;
        if (!this.a.equals(range.a)) {
            return false;
        }
        return this.b.equals(range.b);
    }

    public Position g() {
        return this.a;
    }

    public int h() {
        return this.a.a;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return this.a + "-" + this.b;
    }
}
