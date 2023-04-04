package de.nilsauf.codecademy.DiningReviewApi.Data;

import lombok.Data;

@Data
public class AdminReviewAction {
    private Long reviewId;
    private boolean accepted;
}
