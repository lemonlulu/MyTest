package labelTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemon on 14-11-11.
 */
public class Main {
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target(ElementType.METHOD)
//    public @interface WithResponseFilter {
//
//        /**
//         * The class of the response filter.
//         *
//         * @return
//         */
//        Class<? extends ResponseFilter> value();
//
//        /**
//         * The execution priority of the filter.
//         * <p/>
//         * Filters will be executed in the ascending order of priority.
//         * <p/>
//         * Filters with a negative priority will be executed before all global response filters.
//         * Filters with a non-negative priority will be executed before all global response filters.
//         *
//         * @return
//         */
//        int priority() default 0;
//
//        /**
//         * Whether the filter instance can be reused.
//         *
//         * @return
//         */
//        boolean reusable() default true;
//    }

}


//    @WithResponseFilters({
//            @WithResponseFilter(value = TestResponseFilter.class, priority = -1),
////            @WithResponseFilter(TestResponseFilter.class)
//    })
//    public GetMoviesResponseType getMovies(GetMoviesRequestType request) throws Exception {
//        int totalCount = request.count != null ? Math.max(0, request.count) : movies.size();
//
//        int batchCount = totalCount / movies.size();
//        int extraCount = totalCount % movies.size();
//
//        List<MovieDto> retMovies = new ArrayList<MovieDto>();
//        for (int i = 0; i < batchCount; ++i) {
//            retMovies.addAll(movies);
//        }
//        retMovies.addAll(movies.subList(0, extraCount));
//
//        return new GetMoviesResponseType(null, retMovies);
//    }