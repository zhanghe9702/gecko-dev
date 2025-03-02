/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.service.pocket

import android.annotation.SuppressLint
import mozilla.components.service.pocket.mars.SponsoredContentsUseCases
import mozilla.components.service.pocket.recommendations.ContentRecommendationsUseCases
import mozilla.components.service.pocket.spocs.SpocsUseCases
import mozilla.components.service.pocket.stories.PocketStoriesUseCases

/**
 * Provides global access to the dependencies needed for updating Pocket stories.
 */
internal object GlobalDependencyProvider {
    internal object RecommendedStories {
        /**
         * Possible actions regarding the list of recommended stories.
         */
        @SuppressLint("StaticFieldLeak")
        internal var useCases: PocketStoriesUseCases? = null
            private set

        /**
         * Convenience method for setting all details used when communicating with the Pocket server.
         *
         * @param useCases [PocketStoriesUseCases] containing all possible actions regarding
         * the list of recommended stories.
         */
        internal fun initialize(
            useCases: PocketStoriesUseCases,
        ) {
            this.useCases = useCases
        }

        /**
         * Convenience method for cleaning up any resources held for communicating with the Pocket server.
         */
        internal fun reset() {
            this.useCases = null
        }
    }

    internal object SponsoredStories {
        /**
         * Possible actions regarding the list of sponsored stories.
         */
        @SuppressLint("StaticFieldLeak")
        internal var useCases: SpocsUseCases? = null
            private set

        /**
         * Convenience method for setting all details used when communicating with the Pocket server.
         *
         * @param useCases [SpocsUseCases] containing all possible actions regarding the list of sponsored stories.
         */
        internal fun initialize(
            useCases: SpocsUseCases,
        ) {
            this.useCases = useCases
        }

        /**
         * Convenience method for cleaning up any resources held for communicating with the Pocket server.
         */
        internal fun reset() {
            useCases = null
        }
    }

    internal object ContentRecommendations {
        /**
         * Possible actions regarding the list of content recommendations.
         */
        @SuppressLint("StaticFieldLeak")
        internal var useCases: ContentRecommendationsUseCases? = null
            private set

        /**
         * Convenience method for setting all details used when communicating with the
         * Merino server.
         *
         * @param useCases [ContentRecommendationsUseCases] containing all possible actions
         * regarding the list of content recommendations.
         */
        internal fun initialize(
            useCases: ContentRecommendationsUseCases,
        ) {
            this.useCases = useCases
        }

        /**
         * Convenience method for cleaning up any resources held for communicating
         * with the Merino server.
         */
        internal fun reset() {
            this.useCases = null
        }
    }

    internal object SponsoredContents {
        /**
         * Use cases for sponsored contents actions.
         */
        @SuppressLint("StaticFieldLeak")
        internal var useCases: SponsoredContentsUseCases? = null
            private set

        /**
         * Convenience method for setting all details used when communicating with the
         * sponsored content provider.
         *
         * @param useCases [SponsoredContentsUseCases] containing all possible actions regarding
         * sponsored content.
         */
        internal fun initialize(
            useCases: SponsoredContentsUseCases,
        ) {
            this.useCases = useCases
        }

        /**
         * Convenience method for cleaning up any resources held for communicating
         * with the sponsored content provider.
         */
        internal fun reset() {
            this.useCases = null
        }
    }
}
