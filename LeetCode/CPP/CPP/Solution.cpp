#include "pch.h"
#include "Solution.h"

using namespace std;

Solution::Solution()
{
}


Solution::~Solution()
{
}

int Solution::minPathSum(vector<vector<int>>& grid)
{
	int row = grid.size(), col = grid[0].size();
	//int grid[row][col];//���ʽ���뺬�г���ֵ

	/*
	int row = grid.size()+1, col = grid[0].size()+1;
	int dp_1[row][col];//���ʽ���뺬�г���ֵ
	int **dp = new int[row][col]; //���ʽ���뺬�г���ֵ
	*/

	//������ʼ��
	/*
	    vector<vector<int>> dp;
	    vector<vector<int>> newOne(r, vector<int>(c, 0));

	    vector<vector<int>> res;
        res.resize(r);//r��
        for (int k = 0; k < r; ++k){
            res[k].resize(c);//ÿ��Ϊc��
        }
	*/
	//int row = grid.size(), col = grid[0].size();
	//int dp[row][col];
	//grid[0][0] = grid[0][0];
	for(int i = 1 ; i < col ; ++i){
		grid[0][i] += grid[0][i - 1];
	}
	for (int i = 1; i < row; ++i) {
		grid[i][0] += grid[i-1][0];
	}

	for (int i = 1; i < row; ++i) {
		for (int j = 1; j < col; ++j) {
			grid[i][j] += min(grid[i - 1][j], grid[i][j - 1]);
		}
	}

	return grid[row-1][col-1];
}
