package o;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class HQ1 {

    /* loaded from: classes.dex */
    public static final class a implements Iterator<Rect>, GW0 {
        public final RegionIterator X;
        public final Rect Y;
        public boolean Z;

        public a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.X = regionIterator;
            Rect rect = new Rect();
            this.Y = rect;
            this.Z = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Rect next() {
            if (this.Z) {
                Rect rect = new Rect(this.Y);
                this.Z = this.X.next(this.Y);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Z;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final Region a(Region region, Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final Region b(Region region, Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean c(Region region, Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void d(Region region, HA0<? super Rect, C7458kA2> ha0) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            }
            ha0.invoke(rect);
        }
    }

    public static final Iterator<Rect> e(Region region) {
        return new a(region);
    }

    public static final Region f(Region region, Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region g(Region region, Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    public static final Region h(Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region i(Region region, Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region j(Region region, Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region k(Region region, Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region l(Region region, Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region m(Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region n(Region region, Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    public static final Region o(Region region, Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
